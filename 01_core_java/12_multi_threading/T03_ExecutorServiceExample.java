import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T03_ExecutorServiceExample {

    public static void main(String[] args) {
        System.out.println("ExecutorService Example Running...");
        // 1. Create Thread Pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // 2. Define Task
        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        // 3. Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            executor.submit(task);
        }
        // 4. Shutdown executor
        executor.shutdown();
    }
}