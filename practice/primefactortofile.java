//Input an integer and print all its prime factors to a file.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get the input integer from the user
        System.out.print("Enter an integer: ");
        int number = s.nextInt();

        // Get the output file path from the user
        System.out.print("Enter the output file path: ");
        String outputPath = s.next();

        // Find and print prime factors to the file
        try {
            FileWriter fr = new FileWriter(outputPath);

            fr.write("Prime factors of " + number + " are: ");
            findAndPrintPrimeFactors(number, fr);

            fr.close();
            System.out.println("Prime factors have been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Close the scanner
        s.close();
    }

    private static void findAndPrintPrimeFactors(int num, FileWriter fileWriter) throws IOException {
        // Find and print prime factors
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                fileWriter.write(i + " ");
                num /= i;
            }
        }
    }
}
