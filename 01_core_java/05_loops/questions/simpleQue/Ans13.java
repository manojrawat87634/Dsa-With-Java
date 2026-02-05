import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }
        sc.close();
        System.out.println("Number of digits = " + count);
    }
}
