import java.util.HashMap;

public class MyFirstAPITester {

    public void verifyAPI(){
        HashMap<String, String> params=new HashMap<>();
        HashMap<String, String> headers=new HashMap<>();
        APIRequest apiRequest=new APIRequest("https://petstore.swagger.io",params,headers,"GET","/v2/pet/findByStatus?status=available");
        APIHelper apiHelper=new APIHelper();
        apiHelper.hitAPI(apiRequest);
    }
}
