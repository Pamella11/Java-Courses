package StreamsFilesDirectories.Lab;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Lab\\Files-and-Streams";

        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {

                        System.out.printf("%s: [%s]%n",
                                file.getName(), file.length());
                    }
                }

            }
        }
    }
}
