import com.google.gson.JsonObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonProcessorTest {

JsonProcessor ob=new JsonProcessor();
    @Test
    public void verifyString()
    {
        JsonObject jo=new JsonObject();
        jo.addProperty("name","Rakhi");
        String actual=ob.getObjectToString(jo);
        Assert.assertEquals(actual,"{\"name\":\"Rakhi\"}");

    }

    @Test
    public void verifyStrings()
    {
        JsonObject jo=new JsonObject();
        jo.addProperty("name","Rakhi");
        jo.addProperty("Address","Rakhi Nilayam");
        String actual=ob.getObjectToString(jo);
        System.out.println(actual);

    }

   /* @Test
    public void verifyObject()
    {
        JsonObject ob2=new JsonObject();
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JsonObject actual=ob.jsonStringToJsonObject(ob2);
        Assert.assertEquals(actual,"{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}");
    }*/
}
