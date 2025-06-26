package ex_18082024;

public class Lab60 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted()
    {
        System.out.println("extracted");
        Integer[] i=new Integer[2];
        try {
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("ArrayIndexoutofbound");
        } finally {
            System.out.println("EOP");
        }
    }
}
