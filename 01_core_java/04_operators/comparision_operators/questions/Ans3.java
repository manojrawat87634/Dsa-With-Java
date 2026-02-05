import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 4 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

        sc.close();
    }
}
