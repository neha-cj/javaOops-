import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Reading from a file
        readFile(inputFile);

        // Writing to a file
        writeFile(outputFile);
    }

    private static void readFile(String inputFile) {
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            System.out.println("Reading from the file:");

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }

    private static void writeFile(String outputFile) {
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            // Writing some content to the file
            String content = "Hello, this is a file handling example in Java.\n" +
                             "It demonstrates how to read from a file and write to another file.\n" +
                             "Enjoy learning Java!";

            outputStream.write(content.getBytes());
            System.out.println("\nFile has been written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
