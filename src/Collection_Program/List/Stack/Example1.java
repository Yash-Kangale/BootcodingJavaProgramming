package Collection_Program.List.Stack;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);

        System.out.println(stack.search(10));
        System.out.println(stack.peek());
        System.out.println(stack.contains(60));

        System.out.println(stack.add(60));

        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }
}
