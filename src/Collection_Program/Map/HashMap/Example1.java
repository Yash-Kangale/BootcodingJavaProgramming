package Collection_Program.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Dosa");
        map.put(2,"Idli Sambhar");
        map.put(3,"Medu vada");
        map.put(4,"Uttapam");
        map.put(5,"Appe");
        System.out.println(map);

        System.out.println(map.get(3));

        System.out.println(map);
        System.out.println(map.keySet());

    }
}
