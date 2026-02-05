import java.util.Scanner;

public class Ans11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.close();
        System.out.print("Vision test passed? (yes/no): ");
        String vision = sc.next();

        if (age >= 18) {
            if (vision.equalsIgnoreCase("yes")) {
                System.out.println("Eligible for license");
            } else {
                System.out.println("Vision test required");
            }
        } else {
            System.out.println("Not eligible due to age");
        }
    }
}
