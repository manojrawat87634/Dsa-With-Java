import java.util.Scanner;

public class Ans7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int firstDigit = num / 10;
        int secondDigit = num % 10;

        int product = firstDigit * secondDigit;
        System.out.println("Product of digits = " + product);

        sc.close();
    }
}
