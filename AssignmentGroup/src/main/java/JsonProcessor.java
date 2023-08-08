import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class JsonProcessor {
    public String getObjectToString(JsonObject ob) {
         return ob.toString();//converting json object to string
    }

/*public JsonObject getStringToObject()
{
    String json = "{\"Success\":true,\"Message\":\"Invalid access token.\"}";
    JsonParser jsonParser = new JsonParser();
    JsonObject jo = (JsonObject)jsonParser.parse(json);
    return jo;
}*/


   // public JsonObject jsonStringToJsonObject(JsonObject json){
        //JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);

        // print the JSON object
       // System.out.println(jsonObject);
       // return jsonObject;
    //}
}
