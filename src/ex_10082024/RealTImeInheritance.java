package ex_10082024;

public class RealTImeInheritance {
    public static void main(String[] args) {
        BaseClass t1=new TestCase1();
        t1.setBrowser("Opera",true);
        t1.openBrowser();
        t1.closeBrowser();
    }



}

class TestCase1 extends BaseClass{

    TestCase1(){
        super();// calling DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class BaseClass{

    BaseClass(){
        System.out.println("DC");
    }

    BaseClass(String b){
        System.out.println("PC");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if(isAuth)
        {
            this.browser = browser;
        }
        else {
            System.out.println("not Allowed");
        }

    }

    void openBrowser()
    {
        System.out.println("Chrome Browser");
    }

    void openBrowser(String browserName)
    {
        System.out.println("open Browser "+browserName);
    }

    void closeBrowser()
    {
        System.out.println("Close browser");
    }




}
