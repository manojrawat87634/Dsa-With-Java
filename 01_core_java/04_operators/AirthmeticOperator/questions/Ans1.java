import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = 3.14 * r * r;
        System.out.println("Area of circle = " + area);

        sc.close();
    }
}
