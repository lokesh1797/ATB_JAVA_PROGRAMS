package ex_10082024;

public class Lab47 {
    public static void main(String[] args) {
        VWOLogin vwoLogin= new VWOLogin("admin","password123");
        //vwoLogin.password="123";
        //System.out.println(vwoLogin.password);
    }

}


class VWOLogin{
    public String username;
    private String password;

    public VWOLogin(String username,String password)
    {
        this.username=username;
        this.password=password;
    }
}