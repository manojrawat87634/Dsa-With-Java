import java.util.Stack;

public class MyStack{
    public static void main(String[] args) {
        Stack <String> data = new Stack<>(); //
        System.out.println(data.isEmpty());
        data.push("manoj");
        data.push("manoj@gmail.com");
        data.push("Delhi");
        // System.out.println(data);
        // data.pop();
        System.out.println(data.isEmpty());
        System.out.println(data.peek());
        System.out.println(data);
    }
}