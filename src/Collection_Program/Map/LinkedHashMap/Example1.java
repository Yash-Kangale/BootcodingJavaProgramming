package Collection_Program.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Orange");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Orange");
        map.put(5,"Mosambi");
        System.out.println(map);

        System.out.println(map.entrySet());

        System.out.println(map.get(1));

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        System.out.println(map.containsKey(4));

        System.out.println(map.equals("Lemon"));

    }
}
