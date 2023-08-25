package ObjectsAndClasses.Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Songs> songsList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            //typeList}_{name}_{time}"
            String data = scanner.nextLine();
            String typeList = data.split("_")[0];
            String name = data.split("_")[1];
            String time = data.split("_")[2];

            Songs songs = new Songs(typeList,name, time);
            songsList.add(songs);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Songs song:songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Songs song:songsList) {
                if (song.getListType().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
