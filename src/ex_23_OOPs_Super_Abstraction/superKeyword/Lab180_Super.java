package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab180_Super {
}
class BaseClass{
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;
    BaseClass() {
        System.out.println("DC- Parent");
    }
    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC- Parent");

    }
}
