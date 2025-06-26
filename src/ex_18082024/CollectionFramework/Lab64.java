package ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab64 {
    //collecction framework
    public static void main(String[] args) {
      //  Integer [] arr=new Integer[10];
        //int[] arr2=new int[10];
        //List muList=new ArrayList<>();// dynamic dispatch

        ArrayList mylist2=new ArrayList();
        mylist2.add("lucky");
        mylist2.add("kumar");
        mylist2.add("lokesh");

        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("lokesh"));
        mylist2.add(20);
        String s2= mylist2.get(1).toString();




    }
}
