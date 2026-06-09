package ex_25_ENUM;

public enum ENV {
    DEV("https://dev.mvpp.com"),
    QA("https://qa.myapp.com"),
    STAGGING("htpps://staging.myapp.com"),
    PREPROD("https://preprod.myapp.com"),
    UAT("https://uat.myapp.com"),
    PROD("https://myapp.com");

    private String baseURL;

    ENV(String baseUrl) {
        this.baseURL = baseUrl;
    }
    public String getBaseURL(){
      return this.baseURL;

    }
}
