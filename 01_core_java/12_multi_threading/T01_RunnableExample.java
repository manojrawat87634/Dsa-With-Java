class Task1 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("Task 1 is running ");
        }
    }
}

class Task2 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("Task 2 is running ");
        }
    }
}


public class T01_RunnableExample {
   public static void main(String[] args) {
     Thread t1 = new Thread(new Task1());
    Thread t2 = new Thread(new Task2());
    t1.start();
    t2.start();
   }
}