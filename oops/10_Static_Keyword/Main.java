class Counter {
    static int count = 0;  // belongs to class, shared by all objects

    Counter() {
        count++;   // increment whenever object is created
    }

    void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.showCount();  // Count: 3
        c2.showCount();  // Count: 3
        System.out.println(Counter.count); // ✅ access without object
    }
}
