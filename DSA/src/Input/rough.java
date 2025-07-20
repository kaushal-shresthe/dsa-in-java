package Input;

import java.lang.*;

class MyThread extends Thread {
    // Override the run() method to define the code that will run in the thread
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        // Create an instance of MyThread class
        MyThread t1 = new MyThread();

        // Start the thread
        t1.start();
    }
}
