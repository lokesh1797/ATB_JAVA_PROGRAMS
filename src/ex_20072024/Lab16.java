package ex_20072024;

import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) {
        //Grade calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter ur score");
        int score=sc.nextInt();
        char grade='F';

        if((score>=90)&&(score<=100))
        {
            grade = 'A';
        }
        else if ((score>=80)&&(score<90))
        {
            grade = 'B';
        }
        else if ((score>=70)&&(score<80))
        {
            grade = 'C';
        }
        else if ((score>=60)&&(score<70))
        {
            grade = 'D';
        }
        else if ((score<0)||(score>100))
        {
            System.out.println("please enter a valid score");
        }
        else
        {
            grade = 'F';
        }

        System.out.println("Grade is "+ grade);

        sc.close();


    }
}
