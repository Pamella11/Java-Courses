package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

       String command = scanner.nextLine();

        //"Craft!"
        while (!command.equals("Craft!")) {

            String [] commandParts = command.split(" - ");

            if (commandParts[0].equals("Collect")) {
                //•	"Collect - {item}" - you should add the given item to your inventory.
                // If the item already exists, you should skip this line.
                String item = commandParts[1];
                if (!inventory.contains(item)) {
                    inventory.add(item);
                }
            } else if (commandParts[0].equals("Drop")) {
              //"Drop - {item}" - you should remove the item from your inventory if it exists.
                String item = commandParts[1];
                inventory.remove(item);
            } else if (commandParts[0].equals("Combine Items")) {
                //"Combine Items - {old_item}:{new_item}" - you should check if the old item exists.
                String item = commandParts[1];
                String[] items = item.split(":");
                String oldItem = items[0];
                String newItem = items[1];
                if (inventory.contains(oldItem)) {
                    int oldItemIndex = inventory.indexOf(oldItem);
                    int newItemIndex = oldItemIndex + 1;
                    if (newItemIndex >= 0 && newItemIndex < inventory.size()) {
                        inventory.add(newItemIndex, newItem);
                        // If so, add the new item after the old one.
                        // Otherwise, ignore the command.
                    }
                }
            } else if (commandParts[0].equals("Renew")) {
                String item = commandParts[1];
                if (inventory.contains(item)) {
                    inventory.remove(item);
                    inventory.add(item);
                }
                //•	"Renew – {item}" – if the given item exists, you should change its position and put it last in your inventory.
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
