package ex_21072024;

import java.util.Scanner;

public class Lab34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number");
        int fact=1,i;
        i=sc.nextInt();
        while(i>0)
        {
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of the number is "+fact);
    }
}
