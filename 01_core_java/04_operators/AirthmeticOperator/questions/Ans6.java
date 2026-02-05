import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int firstDigit = num / 10;
        int secondDigit = num % 10;

        int sum = firstDigit + secondDigit;
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
