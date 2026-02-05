import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double cost = quantity * price;
        System.out.println("Total Cost = " + cost);

        sc.close();
    }
}
