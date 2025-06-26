package ex_24082024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab70 {
    public static void main(String[] args) {

        //List allows duplicates
        //Set does not allows duplicates

        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ts= new TreeSet();

        hs.add("apple");
        hs.add("orange");
        System.out.println(hs);


    }
}
