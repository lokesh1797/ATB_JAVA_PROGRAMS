package ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab67 {
    public static void main(String[] args) {
        List mylist=new ArrayList<>();
        mylist.add("lokesh");
        mylist.add("kumar");
        mylist.add("anusha");
        mylist.add("Kiran");
        mylist.add("lokesh");
        mylist.add("lokesh");
        System.out.println(mylist);
        mylist.remove("lokesh");
        System.out.println(mylist);
        mylist.clear();
        mylist.isEmpty();
        mylist.add("lokesh");
        mylist.set(0,"loki");
        System.out.println(mylist);
        mylist.add(123);

        // printing

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println("-------------");

        for (Object o:mylist){
            System.out.println(o);
        }

    }
}
