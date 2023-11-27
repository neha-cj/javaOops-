public class OddEvenThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread oddThread = new Thread(new OddNumberPrinter());
        Thread evenThread = new Thread(new EvenNumberPrinter());

        // Start the threads
        oddThread.start();
        evenThread.start();
    }

    // Thread for displaying odd numbers
    static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            System.out.println("Odd Numbers:");
            for (int i = 1; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Thread for displaying even numbers
    static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            System.out.println("Even Numbers:");
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
