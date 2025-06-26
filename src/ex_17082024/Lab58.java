package ex_17082024;

public class Lab58 {
    public static void main(String[] args) {
        int b= 0;
        try {
            String ip=args[0];
            System.out.println(ip);
            int a=Integer.parseInt(ip);
            b = 1000/a;
        } catch (ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
