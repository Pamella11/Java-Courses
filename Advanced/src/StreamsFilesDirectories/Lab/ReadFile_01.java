package StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();

        while (oneByte >= 0) {

            String curr = Integer.toBinaryString(oneByte);

            System.out.print(curr + " ");

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();

    }
}
