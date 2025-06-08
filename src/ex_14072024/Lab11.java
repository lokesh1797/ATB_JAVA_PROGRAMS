package ex_14072024;

public class Lab11 {
    public static void main(String[] args) {
        String S1="Lokesh";
        S1="kumar";
        S1="V";
        S1="Lokesh";

        String S2="Hello";

        String S4="Lokesh";

        String S3=S1.concat(S2);

        System.out.println(S3);
        System.out.println(S1==S4);// check for Reference
        System.out.println(S1.equals(S4));// checks for content
        System.out.println(S1.indexOf('o'));
        System.out.println(S1.substring(0,3));


    }
}
