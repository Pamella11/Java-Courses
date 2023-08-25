package List.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < counter; i++) {

            String command = scanner.nextLine();

            if (command.contains("is going")) {
                String name = command.split(" ")[0];
             if (!guestsList.contains(name)) {
                 guestsList.add(name);
             } else {
                 System.out.println(name + " is already in the list!");
             }
            } else if (command.contains("not")) {
                String name = command.split(" ")[0];
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for (String name: guestsList) {
            System.out.println(name);
        }
    }
}
