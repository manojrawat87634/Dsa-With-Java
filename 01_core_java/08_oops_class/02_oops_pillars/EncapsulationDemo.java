class BankAccount {
    private double balance;   // data hiding

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}
