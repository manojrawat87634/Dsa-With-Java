package Recursion;

public class HeadRec {
    public static void headRec (int n){
        if (n == 10){
            return;
        }
        
        headRec(n + 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        headRec(0);
    }
}
