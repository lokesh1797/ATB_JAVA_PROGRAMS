package ex_10082024.polymorphism;

public class Lab49 {
    public static void main(String[] args) {
        MathOperations mathOperations=new MathOperations();
        int result= mathOperations.add(2,3);
        System.out.println(result);
        double result2= mathOperations.add(2.4,3.5);
        System.out.println(result2);

    }
}
