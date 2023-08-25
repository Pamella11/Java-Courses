package StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\input.txt";
        String outputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\04.ExtractIntegersOutput.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintWriter printer = new PrintWriter(new FileOutputStream(outputPath));

        while (reader.hasNext()){

            if (reader.hasNextInt()){
                printer.println(reader.nextInt()); // Write the next integer to the output file
            }

            reader.next(); // Move to the next token (skipping non-integer tokens)
        }

        printer.close(); // Close the output file
    }
}
