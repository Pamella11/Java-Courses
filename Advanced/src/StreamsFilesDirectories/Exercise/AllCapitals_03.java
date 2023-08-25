package StreamsFilesDirectories.Exercise;

import java.io.*;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        //1. взимаме всички редове от файл input.txt
        //2. обхождаме всеки един ред -> правим всички букви главни -> записваме реда с главаните букви в нов файл

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\Files-and-Streams\\output.txt"));
        //начин 1:
        /*List<String> allLines = Files.readAllLines(Path.of(pathToFile));
        for (String line : allLines) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();*/

        //начин 2:
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String line = reader.readLine();
        //line == null -> нямаме такъв ред
        while (line != null) {
            writer.write(line.toUpperCase());
            writer.newLine();

            line = reader.readLine();
        }

        writer.close();
    }
}
