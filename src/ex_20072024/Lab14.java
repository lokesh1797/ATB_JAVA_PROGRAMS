package ex_20072024;

import java.util.Scanner;

public class Lab14 {
    //to take a number from user and findd whether it is odd or even
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int user_input=sc.nextInt();

        if ((user_input%2) == 0)
        {
            System.out.println(user_input +" is an even number");
        }
        else
        {
            System.out.println(user_input + " is an odd number");
        }

    }
}
