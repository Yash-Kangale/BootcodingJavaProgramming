package Collection_Program.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example4 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.add("Samosa");
        queue.add("Kachori");
        queue.add("Aloo Bonda");
        queue.add("Palak Vada");
        queue.add("Dhokla");
        queue.add("Tarri Poha");
        System.out.println(queue);

        System.out.println(queue.getClass());

        System.out.println(queue.remove("Dhokla"));
        System.out.println(queue);

        System.out.println(queue.add("Dhokla"));
        System.out.println(queue);

        System.out.println(queue.contains("Dosa"));

        System.out.println(queue.element());

        System.out.println(queue.equals("Gulab Jamun"));
    }
}
