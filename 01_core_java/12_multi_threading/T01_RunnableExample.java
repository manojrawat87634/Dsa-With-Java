class MyTask implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task 1 running in: " + Thread.currentThread().getName());
        }
    }
}

class MyTask2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task 2 running in: " + Thread.currentThread().getName());
        }
    }
}

public class T01_RunnableExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask2());

        t1.start();
        t2.start();
    }
}