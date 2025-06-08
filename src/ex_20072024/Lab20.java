package ex_20072024;

import java.util.Scanner;

public class Lab20 {
    public static void main(String[] args) {
        //take input and tell is it vowel or not
        System.out.println("Enter an alphabet");
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);

        switch (input){
            case 'a' :
                System.out.println("vowel");
                break;
            case 'e' :
                System.out.println("vowel");
                break;
            case 'i' :
                System.out.println("vowel");
                break;
            case 'o' :
                System.out.println("vowel");
                break;
            case 'u' :
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}
