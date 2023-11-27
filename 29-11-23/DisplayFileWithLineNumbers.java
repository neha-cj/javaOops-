import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileWithLineNumbers {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Display the file with line numbers
        displayFileWithLineNumbers(filePath);
    }

    private static void displayFileWithLineNumbers(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Displaying file with line numbers:");

            int lineNumber = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
