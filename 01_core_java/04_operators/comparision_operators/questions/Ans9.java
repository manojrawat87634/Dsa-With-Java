import java.util.Scanner;

public class Ans9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in °C: ");
        double temp = sc.nextDouble();
        sc.close();
        if (temp < 15) {
            System.out.println("Weather: Cold");
        } else if (temp <= 30) {
            System.out.println("Weather: Pleasant");
        } else {
            System.out.println("Weather: Hot");
        }
    }
}
