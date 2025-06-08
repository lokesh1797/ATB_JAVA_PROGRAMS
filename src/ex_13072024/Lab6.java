package ex_13072024;

public class Lab6 {
    public static void main(String[] args) {
        boolean b1= true;
        boolean a1= false;
        boolean result;

        int a= 10;
        int b= 1;

        a+= 10;// a= a+10
        a-=10;// a=a-10;
        a/=10;// a=a/10;
        a*=10;//a=a*10;

        a= a+b;
        result= a>b;
        result= a<b;
        result= a>=b;
        result= a<=b;

        boolean R= !((a>b)||(b>a) );


    }
}
