import java.util.HashMap;

public class APIRequest {
    String baseurl;
    HashMap<String,String>param=new HashMap<String,String>();
    String APIPath="";



    public String getBaseurl() {
        return baseurl;
    }

    public HashMap<String, String> getParam() {
        return param;
    }

    public String getAPIPath() {
        return APIPath;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public String getRequestType() {
        return requestType;
    }

    HashMap<String,String>headers=new HashMap<String,String>();
    String requestType;

    public APIRequest(String baseurl,String APIPath, HashMap<String, String> param, HashMap<String, String> headers, String requestType) {
        this.baseurl = baseurl;
        this.APIPath=APIPath;
        this.param = param;
        this.headers = headers;
        this.requestType = requestType;
    }
}
