package classe_and_objects;

public class SuccessResponse {

    private Integer responseCode;
    private String body;

    public SuccessResponse() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }
}
