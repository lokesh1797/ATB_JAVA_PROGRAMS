package ex_21072024;

import java.util.Scanner;

public class Lab31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int n=sc.nextInt();
        if (n%2 ==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is an odd number");

    }
}
