package ex_20072024;

public class Lab22 {
    public static void main(String[] args) {
        char code ='B';
        int val=switch(code)
        {
            case 'A': yield 65;
            case 'B': yield 66;//return

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
