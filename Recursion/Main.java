import java.util.Scanner;


public class Main {
    public static void printNum(int n){
        if (n == 10){
            return;
        }
        
        System.out.println(n);
        printNum(n + 1);
    }

    // 5 -> 5 * 4 * 3 * 2 * 1 = 120
    // 4 -> 4 * 3 * 2 * 1 = 24

    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    // fact = f
    // f(5) - 5 *  4 * 3 * 2 *  1
    // f(5) - 5 * f(4)
    // f(4) - 4 * f(3)
    // f(3) - 3 * f(2)
    // f(2) - 2 * f(1)
    // f(1) - 1

    public static void main(String[] args) {
        // printNum(0);
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(fact(n1));
    }
}