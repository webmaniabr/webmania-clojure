package com.webmania.sdk;
import java.nio.file.*;
import java.util.*;
public final class ClojureFixture implements AutoCloseable {
 private final SocketFixture fixture;
 public ClojureFixture(boolean tls) throws Exception {fixture=new SocketFixture(tls);}
 public ClientConfig config(String module) {return fixture.config(module);}
 public int count(){return fixture.requests.size();}
 public int connections(){return fixture.connections.get();}
 public byte[] responseBytes(){return fixture.reply.body();}
 public int responseStatus(){return fixture.reply.status();}
 public String responseMedia(){return fixture.reply.media();}
 public void reply(String media,byte[] body){fixture.responder=null;fixture.reply=SocketFixture.Reply.bytes(media,body);}
 public void redirect(String to){fixture.reply=new SocketFixture.Reply(302,"text/html",new byte[0],Map.of("Location",to),0,0,null,false);}
 public long received(int index){return fixture.receivedNanos.get(index);}
 public java.net.URI origin(){return fixture.origin();}
 public ClientConfig deadlineConfig(String module,long ms){var b=ClientConfig.builder().origin(module,fixture.origin()).deadline(java.time.Duration.ofMillis(ms));if(fixture.secure)b.sslContext(SocketFixture.trust);return b.build();}
 public void respond(java.util.function.Function<Map<String,Object>,String> response){fixture.responder=q->SocketFixture.Reply.json(response.apply(Map.of("target",q.target(),"body",q.body(),"headers",q.headers())));}
 public void clearResponder(){fixture.responder=null;}
 public void success(String id,byte[] input) {
  var op=Contract.operation(id);var spec=Contract.operationSchema(op);
  if(op.path("binary").asBoolean()) {
   String media=spec.path("responses").path("200").path("content").properties().stream().map(Map.Entry::getKey).filter(x->!x.equals("application/json")).findFirst().orElse("application/pdf");
   byte[] bytes=FileFixtures.valid(media);
   fixture.reply=SocketFixture.Reply.bytes(media,bytes);
  } else {
   int status=spec.path("responses").properties().stream().map(Map.Entry::getKey).filter(x->x.matches("2[0-9]{2}")).mapToInt(Integer::parseInt).min().orElse(200);
   fixture.reply=new SocketFixture.Reply(status,"application/json",input,Map.of(),0,0,null,false);
  }
 }
 public void body(String text){fixture.reply=SocketFixture.Reply.json(text);}
 public void delayed(String text,long ms){fixture.reply=new SocketFixture.Reply(200,"application/json",text.getBytes(java.nio.charset.StandardCharsets.UTF_8),Map.of(),ms,0,null,false);}
 public Map<String,Object> last(){var q=fixture.requests.get(fixture.requests.size()-1);var m=new HashMap<String,Object>();m.put("method",q.method());m.put("target",q.target());m.put("headers",q.headers());m.put("body",q.body());return m;}
 public com.fasterxml.jackson.databind.JsonNode metadata(String id){return Contract.operation(id);}
 public com.fasterxml.jackson.databind.JsonNode schema(String id){return Contract.operationSchema(Contract.operation(id));}
 @Override public void close(){fixture.close();}
}
