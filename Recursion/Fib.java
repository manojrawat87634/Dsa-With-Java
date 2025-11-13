package Recursion;

import java.util.Scanner;

public class Fib {
    // 0 1 1 2 3 5 8 13
    // fib => f
    // f(11) -> f(10) + f(9)
    // f(5) -> 1+ 0+  1 +  1 + 0
    // f(5) -> f(4) + f(3)
    // f(4) -> f(3) + f(2)
    // f(3) -> f(2) + f(1)
    // f(2) -> 1
    // f(1) -> 0


    public static int fib(int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return fib(n - 1) +  fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();

        System.out.println(fib(num));
        sc.close();
    }
}
