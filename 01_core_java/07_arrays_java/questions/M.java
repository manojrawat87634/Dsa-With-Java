import java.util.Scanner;

public class M{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isMemember = sc.next();
        int purchase_amount = sc.nextInt();
        if (isMemember.equals("yes")){
            if (purchase_amount > 1000){
                System.out.println("You get festival offer");
            }
            else{
                System.out.println("You didn't get festival offer");
            }
        }        
        else{
            System.out.println("Not Eligible for festival offer");
        }
        sc.close();
    }
}