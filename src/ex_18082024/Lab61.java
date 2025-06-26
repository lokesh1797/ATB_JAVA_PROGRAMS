package ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab61 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();;

    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("first line");
        String path="/Users/Lokesh/Downloads/api.mp4";
        File file=new File(path);
        FileReader fileReader=new FileReader(file);


    }
}
