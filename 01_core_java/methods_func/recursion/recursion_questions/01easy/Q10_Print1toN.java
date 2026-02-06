public class Q10_Print1toN {

    static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(5); // 1 2 3 4 5
    }
}
