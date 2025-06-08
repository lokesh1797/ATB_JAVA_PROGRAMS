package ex_20072024;

import java.util.Scanner;

public class Lab19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter browser name");
        String Browsername=sc.next();
        Browsername=Browsername.toLowerCase();

        switch (Browsername){
            case "chrome" :
                System.out.println("chrome code execution");
                break;
            case "firefox" :
                System.out.println("firefox code execution");
                break;
            case "edge" :
                System.out.println("edge code execution");
                break;
            default:
                System.out.println("invalid browser");
        }

    }
}
