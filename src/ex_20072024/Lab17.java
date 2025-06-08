package ex_20072024;

import java.util.Scanner;

public class Lab17 {
    public static void main(String[] args) {
        //triangle classifier
        System.out.println("please enter the 3 sides of triangle");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a==b)&&(b==c)&&(c==a))
            System.out.println("it is an equilateral triangle");
        else if((a==b)||(b==c)||(c==a))
            System.out.println("it is an isoceles triangle");
        else
            System.out.println("it is a scalene triangle");
    }
}
