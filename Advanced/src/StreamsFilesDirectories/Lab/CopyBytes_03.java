package StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {

        // Define the paths for the input and output files
        String inputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\input.txt";
        String outputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\03.CopyBytesOutput.txt";

        // Create FileInputStream and FileOutputStream for the input and output files
        FileInputStream in = new FileInputStream(inputPath);
        FileOutputStream out = new FileOutputStream(outputPath);

        // Read the first byte from the input file
        int oneByte = in.read();

        // Process each byte until the end of the file is reached
        while (oneByte >= 0) {
            // Check if the byte represents a space or a new line character
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte); // Write the byte as it is to the output file
            } else {
                // Convert the byte to a string representation
                String digits = String.valueOf(oneByte);
                // Write each digit of the byte separately to the output file
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            // Read the next byte from the input file
            oneByte = in.read();
        }

        // Close the input and output streams
        in.close();
        out.close();
    }
}
