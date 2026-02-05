import java.util.Scanner;

public class Ans14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter entrance score: ");
        int score = sc.nextInt();

        System.out.print("Enter category (General/SC/ST): ");
        String category = sc.next();
        sc.close();
        if (category.equalsIgnoreCase("General")) {
            if (score >= 90) {
                System.out.println("Eligible for admission");
            } else {
                System.out.println("Not eligible");
            }
        } else {
            if (score >= 80) {
                System.out.println("Eligible for admission");
            } else {
                System.out.println("Not eligible");
            }
        }
    }
}
