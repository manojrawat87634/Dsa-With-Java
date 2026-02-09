public class Q05_PalindromeNumber {

    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false
    }
}
