package ex_18082024;

public class Lab62 {
    public static void main(String[] args) throws Exception {

        Bank sbi=new Bank("INR",100);
        Bank jpmorgan=new Bank("USD",89);
        Integer totalnew=sbi.add(jpmorgan);
        System.out.println(totalnew);

    }
}
