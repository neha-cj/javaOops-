import java.util.Random;

public class MultiThreadedProgram {
    private static volatile int sharedValue;

    public static void main(String[] args) {
        // Create three threads
        Thread generatorThread = new Thread(new NumberGenerator());
        Thread squareThread = new Thread(new SquareCalculator());
        Thread cubeThread = new Thread(new CubePrinter());

        // Start the threads
        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }

    // Thread to generate a random integer every 1 second
    static class NumberGenerator implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            try {
                while (true) {
                    sharedValue = random.nextInt(100); // Generate a random integer between 0 and 99
                    System.out.println("Generated Number: " + sharedValue);
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Thread to compute and print the square of the number if it is even
    static class SquareCalculator implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    if (sharedValue % 2 == 0) {
                        int square = sharedValue * sharedValue;
                        System.out.println("Square: " + square);
                    }
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Thread to print the cube of the number if it is odd
    static class CubePrinter implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    if (sharedValue % 2 != 0) {
                        int cube = sharedValue * sharedValue * sharedValue;
                        System.out.println("Cube: " + cube);
                    }
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
