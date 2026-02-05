import java.util.Scanner;

public class Ans16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int c_num = num;
        int temp = num;
        int count = 0;

        // count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int res = 0;

        // Armstrong calculation
        while (num != 0) {
            int digit = num % 10;
            res = res + (int) Math.pow(digit, count);
            num = num / 10;
        }

        if (res == c_num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
