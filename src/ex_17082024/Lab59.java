package ex_17082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab59 {
    public static void main(String[] args) {
        //unchecked exception
        try {
            int a=10;
            int c=a/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("divided by 0 error");
        }
        // checked exxception

        try {
            FileReader f= new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("EOP");
    }
}
