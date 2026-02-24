class BankAccount {

    int balance = 500;

    synchronized void withdraw(int amount) {
        if (amount > this.balance)
            return;
        System.out.println(Thread.currentThread().getName() + " is withdrawing...");

        int temp = balance; // Step 1: Read balance
        temp = temp - amount; // Step 2: Modify
        balance = temp; // Step 3: Write back

        System.out.println(Thread.currentThread().getName() +
                " Remaining Balance: " + balance);
    }
}



public class T02_SynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = () -> account.withdraw(500);
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}