import java.util.Scanner;

public class Ans8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.close();
        if (age >= 0 && age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teen");
        } else if (age <= 59) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }
    }
}
