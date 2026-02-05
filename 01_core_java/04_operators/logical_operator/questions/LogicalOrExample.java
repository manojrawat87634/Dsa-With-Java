import java.util.Scanner;

public class LogicalOrExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is today Sunday? (true/false): ");
        boolean isSunday = sc.nextBoolean();

        System.out.print("Is today a holiday? (true/false): ");
        boolean isHoliday = sc.nextBoolean();
        sc.close();
        if (isSunday || isHoliday) {
            System.out.println("You can relax today 😄");
        } else {
            System.out.println("Go to work 😐");
        }
    }
}
