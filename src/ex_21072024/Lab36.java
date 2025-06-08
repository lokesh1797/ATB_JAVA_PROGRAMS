package ex_21072024;

import java.util.Scanner;

public class Lab36 {
    public static void main(String[] args) {
        int i,n,fact=1;
        System.out.println("Please enter a number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        i=1;
        do{
            fact=fact*i;
            i++;

        }while (i<=n);
        System.out.println("Factorial of the number is "+fact);
    }
}
