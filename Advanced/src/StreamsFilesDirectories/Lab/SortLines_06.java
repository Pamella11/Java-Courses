package StreamsFilesDirectories.Lab;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\input.txt");
        Path outputPath = Paths.get("C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\06.SortLinesOutput.txt");

        List<String> text = Files.readAllLines(inputPath);
        Collections.sort(text);
        Files.write(outputPath, text);

    }
}
