import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();
        sc.close();
        if (attendance >= 75) {
            if (marks >= 33) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Failed due to low marks");
            }
        } else {
            System.out.println("Not eligible due to low attendance");
        }
    }
}
