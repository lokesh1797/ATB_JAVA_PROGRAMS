package ex_24082024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab71 {
    public static void main(String[] args) {
        //Map
        Map m=new HashMap();
        Map m2=new LinkedHashMap();
        Map m3=new TreeMap();

        m.put("name","lokesh");
        m.put("phone",12121212);
        System.out.println(m);
    }
}
