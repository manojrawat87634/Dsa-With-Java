import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // 1. Create Stack
        Stack<Integer> stack = new Stack<>();

        // 2. push() - add elements (TOP of stack)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push: " + stack);

        // 3. peek() - see top element (no removal)
        System.out.println("Top element (peek): " + stack.peek());

        // 4. pop() - remove top element (LIFO)
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);

        System.out.println("Stack after pop: " + stack);

        // 5. isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 6. search() - position from top (1-based)
        System.out.println("Position of 10: " + stack.search(10));
    }
}
