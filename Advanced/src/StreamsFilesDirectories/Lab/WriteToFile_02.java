package StreamsFilesDirectories.Lab;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\input.txt";
        String outputPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\02.WriteToFileOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, ',', '.', '?', '!');

        int oneByte = fileInputStream.read();

        while (oneByte >= 0){

            if (!punctuation.contains((char) oneByte)){
                fileOutputStream.write(oneByte);
            }

            oneByte = fileInputStream.read();
        }




    }
}
