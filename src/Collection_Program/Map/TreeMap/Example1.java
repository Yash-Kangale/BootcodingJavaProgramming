package Collection_Program.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("CSE",1);
        map.put("ETC",2);
        map.put("IT",3);
        map.put("ME",4);
        map.put("CE",5);
        System.out.println(map);

        System.out.println(map.remove("CSE",1));

        System.out.println(map.get("ETC"));

        System.out.println(map.containsKey("ME"));

        System.out.println(map.values());
    }
}
