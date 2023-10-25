package Collection_Program.Queue;
import java.util.ArrayDeque;
import java.util.Queue;
public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> queue= new ArrayDeque<>();

        queue.add(45);
        queue.add(50);
        queue.add(60);
        queue.add(65);
        queue.add(70);

        queue.offer(90);
        queue.offer(91);
        queue.offer(95);
        queue.offer(98);
        queue.offer(100);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer(98));
    }
}
