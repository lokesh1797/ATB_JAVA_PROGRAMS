package ex_21072024;

import java.util.Scanner;

public class Lab35 {
    public static void main(String[] args) {
        int i,fact=1;
        System.out.println("please enter a number");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        for (int j = i; j >0; j--) {
            fact=fact*j;

        }
        System.out.println("Factorial of the number is "+ fact);
    }
}
