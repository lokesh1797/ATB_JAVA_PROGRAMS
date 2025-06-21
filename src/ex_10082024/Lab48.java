package ex_10082024;

public class Lab48 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin1= new VWOLogin1("admin","password123");
        System.out.println(vwoLogin1.getPassword());
        System.out.println(vwoLogin1.getUsername());
        vwoLogin1.setUsername("lokesh");
        vwoLogin1.setPassword("1234",false);
        System.out.println(vwoLogin1.getPassword());
        System.out.println(vwoLogin1.getUsername());

    }
}

class VWOLogin1{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAuth) {
        if (isAuth){
            this.password = password;
        }
        else {
            System.out.println("not allowed");
        }

    }

    public VWOLogin1(String username, String password)
    {
        this.username=username;
        this.password=password;
    }
}
