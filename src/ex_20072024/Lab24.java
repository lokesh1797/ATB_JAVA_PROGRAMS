package ex_20072024;

import java.util.Scanner;

public class Lab24 {
    public static void main(String[] args) {
        //leap year
        System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400 == 0)
            System.out.println("leap year");
        else if ((year%4==0)&&(year%100 !=0))
        {
            System.out.println("leap year");
        }
        else
            System.out.println("not a leap year");
    }
}
