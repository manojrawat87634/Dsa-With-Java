import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a member? (yes/no): ");
        String member = sc.next();

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();
        sc.close();
        if (member.equalsIgnoreCase("yes")) {
            if (amount >= 1000) {
                System.out.println("Eligible for festival offer");
            } else {
                System.out.println("Spend ₹1000 or more to get the offer");
            }
        } else {
            System.out.println("Offer only for members");
        }
    }
}
