import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();

        if (temp > 100.4)
            System.out.println("Fever");
        else
            System.out.println("Normal");

        sc.close();
    }
}
