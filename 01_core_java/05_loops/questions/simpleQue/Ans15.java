import java.util.Scanner;

public class Ans15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int c_num = num;
        int res = 0;
        while (num != 0){
            res = res * 10 + num % 10;
            num /= 10;
        }
        if (res == c_num){
            System.out.println("This is plaindrome number");
        }
        else{
            System.out.println("This is not plaindrome number");
        }
        sc.close();
        // write logic here

    }
}
