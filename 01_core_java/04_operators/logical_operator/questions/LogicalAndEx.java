import java.util.Scanner;

public class LogicalAndEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.next();
        sc.close();
        System.out.print("Enter password: ");
        String password = sc.next();

        if (email.equals("admin@gmail.com") && password.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid email or password");
        }
    }
}
