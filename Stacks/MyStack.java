import java.util.Stack;

public class MyStack{
    public static void main(String[] args) {
        Stack <String> data = new Stack<>();
        data.push("Data 1");
        data.push("Data 2");
        data.push("Data 3");
        data.push("Data 4");
        data.push("Data 5"); // Last in That will be first out 
        System.out.println(data);
        System.out.println(data.peek());
        data.pop();
        System.out.println(data);
        System.out.println(data.peek());
    }
}