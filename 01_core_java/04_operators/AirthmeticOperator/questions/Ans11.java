import java.util.Scanner;

public class Ans11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter bonus amount: ");
        double bonus = sc.nextDouble();

        double totalSalary = basic + bonus;
        System.out.println("Total Salary = " + totalSalary);

        sc.close();
    }
}
