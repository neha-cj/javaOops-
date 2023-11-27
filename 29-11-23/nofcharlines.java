import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileStatistics {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Display file statistics
        displayFileStatistics(filePath);
    }

    private static void displayFileStatistics(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Count characters
                charCount += line.length();

                // Count lines
                lineCount++;

                // Count words using StringTokenizer
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }

            System.out.println("File Statistics for " + filePath + ":");
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
