package ex_20072024;

import java.util.Scanner;

public class Lab23 {
    public static void main(String[] args) {
        //fizz buzz
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur number");
        int input=sc.nextInt();

        if(((input%3)==0)&&((input%5)==0))
            System.out.println("fizzbuzz");
        else if (input%3 ==0) {
            System.out.println("fizz");
        }
        else if(input%5 ==0)
        {
            System.out.println("buzz");
        }
        else
        {
            System.out.println(input);
        }

    }
}
