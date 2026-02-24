interface Calculator{
    int add(int a, int b);
}

public class Main{
    public static void main(String args[]){
        Calculator cl = (a, b) -> a + b;
        System.out.println(cl.add(3, 8));
    }
}