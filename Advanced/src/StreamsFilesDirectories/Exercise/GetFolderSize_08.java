package StreamsFilesDirectories.Exercise;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {

        String pathFolder = "C:\\Users\\pc\\Desktop\\PB projects\\Advanced\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(pathFolder);

        File[] allFilesInFolder = folder.listFiles(); //масив с всички файлове в папката

        int folderSize = 0; //размер на папката
        if (allFilesInFolder != null) {
            for (File file : allFilesInFolder) {
                folderSize += file.length();
            }
        }


        System.out.println("Folder size: " + folderSize);
    }
}
