package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads the path to a file and subtracts the file name and its extension.
        //C:\Internal\training-internal\Template.pptx -> File name: Template
        //                                               File extension: pptx
        String[] filesPath = scanner.nextLine().split("\\\\");

        String file = filesPath[filesPath.length - 1];
        String fileName = file.split("\\.")[0];
        String fileExtension = file.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
