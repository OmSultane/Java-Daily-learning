package Exception;
import java.io.*;


public class Throws {

    // Method declares that it may throw IOException
    static void readFile(String fileName) throws IOException {

        // Using try-with-resources to automatically close FileReader
        try (FileReader file = new FileReader(fileName)) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data); // Read and print file content
            }
        }
        // No need for finally block to close the resource
    }

    public static void main(String[] args) {

        try {
            readFile("test.txt"); // Attempt to read file
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }

        System.out.println("\nProgram continues after file operation.");
    }
}

