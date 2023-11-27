public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create three threads with different priorities
        Thread lowPriorityThread = new Thread(new MyRunnable(), "LowPriorityThread");
        Thread normalPriorityThread = new Thread(new MyRunnable(), "NormalPriorityThread");
        Thread highPriorityThread = new Thread(new MyRunnable(), "HighPriorityThread");

        // Set thread priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Count = " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
