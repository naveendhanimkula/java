import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationsSample {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // The file to create and manipulate

        // Create and write to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is a sample file created.");
            writer.newLine();
            writer.write("It demonstrates file operations in Java.");
            System.out.println("File created and written to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

