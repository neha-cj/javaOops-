import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandlerExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Writing to a file
        writeToFile(filePath);

        // Reading from a file
        readFromFile(filePath);
    }

    private static void writeToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write some content to the file
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("It demonstrates how to write to a file and read from it.\n");
            writer.write("Enjoy learning Java!");

            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("\nReading from the file:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
