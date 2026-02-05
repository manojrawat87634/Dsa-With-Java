import java.util.Scanner;

public class Ans10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        sc.close();
        if (speed < 40) {
            System.out.println("Status: Safe");
        } else if (speed <= 80) {
            System.out.println("Status: Normal");
        } else {
            System.out.println("Status: Over Speed");
        }
    }
}
