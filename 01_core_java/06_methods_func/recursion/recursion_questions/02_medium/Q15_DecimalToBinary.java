public class Q15_DecimalToBinary {

    static void toBinary(int n) {
        if (n == 0) return;
        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        toBinary(15); // 1010
    }
}
