package ex_11082024;

public class Lab53 {

    public static void main(String[] args) {
        ATB a1= new ATB("Lokesh");
        System.out.println(a1.getName());
        System.out.println(ATB.courseName);

        ATB a2=new ATB("kumar");
        System.out.println(a2.getName());


    }


}

class ATB{

    private String name;
    static String courseName="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
}
