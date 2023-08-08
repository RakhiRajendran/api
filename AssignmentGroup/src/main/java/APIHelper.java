import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class APIHelper {
    public static void hitAPI(APIRequest apiRequest) {


        RestAssured.baseURI = apiRequest.getBaseurl();

        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("status", "available");
        request.body(requestParams.toString());
        Response response=null;
        if(apiRequest.getRequestType().equalsIgnoreCase("GET"))
        response = request.get(apiRequest.getAPIPath());
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());

    }
}
