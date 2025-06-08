package ex_21072024;

public class Lab39 {
    public static void main(String[] args) {
        funct1();
        System.out.println(funct2());
        funct3("kumar");
        System.out.println(funct4(1,4));


    }
    //without parameter and without return type
    static void funct1(){
        System.out.println("without parameter and without return type");
    }

    //without parameter and with return type
    static String funct2(){
        return "Lokesh";
    }
    //with parameter and without return type
    static void funct3(String name){
        System.out.println("Hello "+name);
    }

    //with parameter and with return type
    static int funct4(int a,int b){
        return (a+b);
    }


}
