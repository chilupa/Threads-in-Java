public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable); // Target (new state)
        // Here, the thread is in new state (not considered alive unless it is started)

        thread.start(); // a new thread of execution starts (thread becomes alive)
        // Now, the thread moved from new state to runnable state (new --> runnable)

        System.out.println("After start() method, is Thread alive ? - " + thread.isAlive());
        // Executes the run method of the thread as we started the thread.

        System.out.println("After run() method, is Thread alive ? - " + thread.isAlive());
        // The thread is no more alive (dead) after the run method.
    }
}