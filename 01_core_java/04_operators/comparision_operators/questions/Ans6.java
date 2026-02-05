import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (income > 250000)
            System.out.println("Pay Income Tax");
        else
            System.out.println("No Income Tax");

        sc.close();
    }
}
