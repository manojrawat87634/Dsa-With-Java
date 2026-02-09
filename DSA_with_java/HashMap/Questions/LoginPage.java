import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class LoginPage {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("abc@gmail.com", "Abc@123");
        data.put("xyz@gmail.com", "Xyz@123");
        data.put("kbc@gmail.com", "Kbc@123");
        int i = 1;
        while (i <= 3) {
            System.out.println(i + "st Atempt");
            System.out.println(4 - i + " Attempt Left");
            i++;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your email -: ");
            String email = sc.nextLine();
            if (data.get(email) == null) {
                System.out.println("Email Not Registered");
                continue;
            }
            System.out.print("Enter your password -:  ");
            String password = sc.nextLine();
            if (data.get(email).equals(password)) {
                System.out.println("Login Successfully!!");
                break;
            } else {
                System.out.println("Invalid Password");
            }
        }
    }
}