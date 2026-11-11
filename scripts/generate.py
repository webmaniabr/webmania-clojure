#!/usr/bin/env python3
import argparse,hashlib,json,re,zipfile
from pathlib import Path
ROOT=Path(__file__).resolve().parents[1]
SHA='29e262427ca8ec15918c2072020c674c64f88be9427efa949b92ddd802f494e3'
SOURCES_SHA='14edc6f7103aad8c4247d79f2a4698d590e504182df758e093de47774ef9efef'
# contract_digest of the contracts bundled in the pinned Java archive.
DIGEST='371a499f74012bb6b41f23642869dee4954e8394dcba7642edc701aedb3dd59e'
def kebab(s):
 s=re.sub(r'([A-Z]+)([A-Z][a-z])',r'\1-\2',s);return re.sub(r'([a-z0-9])([A-Z])',r'\1-\2',s).lower()
def group(o):
 m=o['module']
 # Report downloads (legacy and current) share the nfe-files client and its explicit access modes.
 return {'api1/fiscal.openapi.json':'nfe','api1/files.openapi.json':'nfe-files','api2/reports.openapi.json':'nfe-files','api1/b2b.openapi.json':'reseller','api2/emitter-files.openapi.json':'emitter-files'}.get(m,'monitor' if '/monitor-' in m else 'emitter')
def require(condition, message):
 if not condition: raise ValueError(message)
def main():
 p=argparse.ArgumentParser();p.add_argument('--java',type=Path,required=True);p.add_argument('--jar',type=Path,required=True);p.add_argument('--sources',type=Path,required=True);p.add_argument('--check',action='store_true');a=p.parse_args();require(hashlib.sha256(a.jar.read_bytes()).hexdigest()==SHA,'Java binary identity mismatch')
 require(hashlib.sha256(a.sources.read_bytes()).hexdigest()==SOURCES_SHA,'Java source identity mismatch')
 with zipfile.ZipFile(a.sources) as source:
  for member in source.namelist():
   if member.endswith('.java'):
    require((a.java/'src/main/java'/member).read_bytes()==source.read(member),'Java source drift: '+member)
 with zipfile.ZipFile(a.jar) as z:
  opbytes=z.read('contracts/operations.json');ops=json.loads(opbytes);names=set(z.namelist())
  provenance=json.loads(z.read('META-INF/contract-provenance.json'));modules=json.loads(z.read('contracts/manifest.json'))['contracts']
  declared=[op for m in modules for path in json.loads(z.read(m))['paths'].values() for method,op in path.items() if method in ('get','post','put','delete','patch')]
 require(provenance['contract_digest']==DIGEST,'Pinned archive contract digest differs')
 require(opbytes==(a.java/'src/main/resources/contracts/operations.json').read_bytes(),'Operation metadata drift');require(len(ops)==len(declared),'Operation count drift')
 output={};lines=['(ns webmania.operations (:require [webmania.core :as core] [webmania.value :as value]))','']
 for o in ops:
  request='com.webmania.sdk.'+o['package']+'.'+o['request'];require(request.replace('.','/')+'.class' in names,'Missing request class')
  fn=kebab(o['id']);scope=group(o)
  lines.extend([f'(defn ^{{:operation-id "{o["id"]}" :scope :{scope} :request-type "{request}"}} {fn}',f'  ([client] ({fn} client (value/model "{request}" {{}})))',f'  ([client request] (core/invoke-typed :{scope} client "{request}" request "{o["id"]}")))',''])
 output['src/main/clojure/webmania/operations.clj']='\n'.join(lines)+'\n';count=0;classes=[]
 for module in sorted((a.java/'src/main/java/com/webmania/sdk/model').iterdir()):
  if not module.is_dir():continue
  lines=[f'(ns webmania.models.{module.name} (:require [webmania.value :as value]))',''];used=set()
  for f in sorted(module.glob('*.java')):
   cls='com.webmania.sdk.model.'+module.name+'.'+f.stem;require(cls.replace('.','/')+'.class' in names,'Missing model class')
   fn=kebab(f.stem);require(fn not in used,'Duplicate factory name');used.add(fn);classes.append(cls);count+=1
   lines.append(f'(defn ^{{:model-class "{cls}"}} {fn}')
   if f'public {f.stem}()' in f.read_text():lines.append(f'  ([] (value/model "{cls}" {{}}))')
   lines.extend([f'  ([values] (value/model "{cls}" values)))',''])
  output[f'src/main/clojure/webmania/models/{module.name}.clj']='\n'.join(lines)+'\n'
 output['src/main/resources/webmania-model-classes.edn']='#{'+''.join('"'+x+'"\n' for x in classes)+'}\n'
 output['operation-map.json']=json.dumps({'java_sha256':SHA,'contract_digest':DIGEST,'operations':[{'id':o['id'],'function':kebab(o['id']),'scope':group(o),'request_class':'com.webmania.sdk.'+o['package']+'.'+o['request'],'enabled':o['enabled']} for o in ops],'model_factories':count},indent=2)+'\n'
 for name,text in output.items():
  file=ROOT/name
  if a.check:require(file.read_text()==text,'Generated output drift: '+name)
  else:file.parent.mkdir(parents=True,exist_ok=True);file.write_text(text)
 print(json.dumps({'operations':len(ops),'enabled':sum(o['enabled'] for o in ops),'named_model_factories':count,'check':a.check}))
if __name__=='__main__':main()
