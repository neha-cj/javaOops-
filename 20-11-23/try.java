import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                // Throw an exception if the entered number is negative
                throw new IllegalArgumentException("Number must be non-negative");
            }

            System.out.println("Square root of the number: " + Math.sqrt(number));
        } catch (IllegalArgumentException e) {
            // Catch the specific exception thrown for negative numbers
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            // This block will be executed regardless of whether an exception is thrown or not
            System.out.println("Finally block executed");
            scanner.close(); // Close the scanner in the finally block to ensure it's always closed
        }
    }
}
