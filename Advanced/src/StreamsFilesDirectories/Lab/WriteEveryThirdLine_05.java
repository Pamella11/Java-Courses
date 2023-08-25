package StreamsFilesDirectories.Lab;

import java.io.*;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\input.txt";
        String outputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\05.WriteEveryThirdLineOutput.txt";

        BufferedReader input = new BufferedReader(new FileReader(inputPath));
        PrintWriter output = new PrintWriter(new FileWriter(outputPath));

        String line = input.readLine();
        int counter = 1;

        while (line != null) {

            if (counter % 3 == 0) {
                output.println(line); // Write the line to the output file
            }

            counter++;
            line = input.readLine(); // Read the next line from the input file
        }

        output.close();
    }
}
