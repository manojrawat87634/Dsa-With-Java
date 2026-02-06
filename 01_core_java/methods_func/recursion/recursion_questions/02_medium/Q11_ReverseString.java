public class Q11_ReverseString {

    static String reverse(String s) {
        if (s.length() == 0) return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("java")); // avaj
    }
}
