package ex_20072024;

import java.util.Scanner;

import static java.lang.Math.max;

public class Lab15 {
    public static void main(String[] args) {
        //max number in 2 inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

       // System.out.println("Maximum of the 2 numbers is "+ max(num2,num1));
        if(num1>num2)
        {
            System.out.println("Maximum of the 2 numbers is "+num1);
        }
        else if(num2>num1)
        {
            System.out.println("Maximum of the 2 numbers is "+ num2);
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }

    }
}
