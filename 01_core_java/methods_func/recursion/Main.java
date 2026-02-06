package recursion;

public class Main {
    static void prNum(int num){
        if (num == 10)return;
        // System.out.println(num);
        // prNum(num + 1);
    }

    static int fact(int num){
        if (num == 1) return 1;
        return num * fact(num - 1);
    }

    static int fib(int n){
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    static int sum(int num){
        if (num == 1) return 1;
        return num + sum(num - 1);
    }
     static void factors(int num, int i){
        if (num < i) return; 
        if (num % i == 0){
            System.out.print(i + " ");
            factors(num / i, i);
            return;
        }
        else {
            factors(num, i+1);
            return;
        }
     }
    public static void main(String[] args) {
        // prNum(1);
        // System.out.println(fact(5));
        // System.out.println(sum(10));
        // System.out.println(fib(10));
        factors(24, 2);
    }
}
