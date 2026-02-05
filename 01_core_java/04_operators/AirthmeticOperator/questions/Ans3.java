import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        double area = l * w;
        System.out.println("Area of rectangle = " + area);

        sc.close();
    }
}
