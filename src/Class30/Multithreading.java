package Class30;

class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Task1 Interrupted");
            }
        }
    }
}
class Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2 - Count: " + i);
            try {
                Thread.sleep(300); // Sleep for 300ms
            } catch (InterruptedException e) {
                System.out.println("Task2 Interrupted");
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        // Creating and starting Task1 using Thread class
        Task1 thread1 = new Task1();
        thread1.start();

        // Creating and starting Task2 using Runnable interface
        Thread thread2 = new Thread(new Task2());
        thread2.start();

        // Main thread prints its own messages
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Count: " + i);
            try {
                Thread.sleep(400); // Sleep for 400ms
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
    }
}
