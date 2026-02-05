import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        double speed = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double distance = speed * time;
        System.out.println("Distance traveled = " + distance);

        sc.close();
    }
}
