package ex_14072024;

public class Lab8 {
    public static void main(String[] args) {
        //widening
        byte b=10;
        int a=b;//implicit casting
        int a1=(int)b;//Explicit casting

        //Narrowing
        int val=300;
        //byte b1=val;// invalid implicit casting
        byte b1= (byte)val;//explicit casting-loss of data
    }
}
