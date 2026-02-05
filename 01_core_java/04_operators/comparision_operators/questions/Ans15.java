import java.util.Scanner;

public class Ans15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        System.out.print("Enter annual income: ");
        int income = sc.nextInt();
        sc.close();
        if (units <= 200) {
            if (income <= 250000) {
                System.out.println("Eligible for electricity subsidy");
            } else {
                System.out.println("Not eligible due to high income");
            }
        } else {
            System.out.println("Not eligible due to high unit consumption");
        }
    }
}
