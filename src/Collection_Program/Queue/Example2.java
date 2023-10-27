package Collection_Program.Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        Queue<String> queue= new ArrayDeque<>();

        queue.offer("Aman");
        queue.offer("Bablu");
        queue.offer("Shyam");
        queue.offer("Jatin");
        queue.offer("Santosh");
        queue.offer("Girish");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.remove());


    }
}
