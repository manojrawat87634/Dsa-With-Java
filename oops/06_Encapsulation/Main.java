class BankAccount {

    // private fields → hidden from outside
    private String accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // setter for balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // setter for balance with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("123456", 1000);

        // cannot access private fields directly
        // acc.balance = 500; // ❌ error

        // access via methods
        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Account: " + acc.getAccountNumber());
        System.out.println("Balance: $" + acc.getBalance());
    }
}
