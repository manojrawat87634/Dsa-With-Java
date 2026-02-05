import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you logged in? (true/false): ");
        boolean isLoggedIn = sc.nextBoolean();
        sc.close();
        if (!isLoggedIn) {
            System.out.println("Please login first");
        } else {
            System.out.println("Welcome back!");
        }
    }
}
