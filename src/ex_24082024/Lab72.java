package ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab72 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",3);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("id2"));

        for (Map.Entry<String,Integer> item :map.entrySet()){
            System.out.println(item.getKey() +"->"+item.getValue());
        }

    }
}
