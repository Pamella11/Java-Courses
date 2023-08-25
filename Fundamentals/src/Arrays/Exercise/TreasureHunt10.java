package Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] parts = input.split(" ");

            String command = parts[0];

            if (command.equals("Loot")) {
                //	"Loot {item1} {item2}…{itemn}":
                for (int i = 1; i < parts.length; i++) {
                    String item = parts[i];
                    if (!initialLoot.contains(item)){
                        initialLoot.add(0, item);
                    }
                }
                //	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
                //	If an item is already contained, don't insert it.
            } else if (command.equals("Drop")) {
                //•	"Drop {index}":
                int index = Integer.parseInt(parts[1]);
                if (index >= 0 && index < initialLoot.size()){
                    String item = initialLoot.get(index);
                    initialLoot.remove(item);
                    initialLoot.add(item);
                }
                //o	Remove the loot at the given position and add it to the end of the treasure chest.
                //o	If the index is invalid, skip the command.

            } else if (command.equals("Steal")) {
                //•	"Steal {count}":
                //o	Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
                //o	Print the stolen items separated by ", ":
                //"{item1}, {item2}, {item3} … {itemn}"
                int count = Integer.parseInt(parts[1]);
                if (initialLoot.size() >= count){
                   // String toRemove = initialLoot.s
                    System.out.println(String.join(", ",initialLoot.subList(initialLoot.size() - count, initialLoot.size())));
                    initialLoot.subList(initialLoot.size() - count, initialLoot.size()).clear();
                } else {
                    System.out.println(String.join(", ", initialLoot));
                    initialLoot.clear();
                }

            }

            input = scanner.nextLine();
        }

        if (initialLoot.isEmpty()){
            System.out.println("Failed treasure hunt.");
        } else {
            //In the end, output the average treasure gain,
            // which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point:
            //"Average treasure gain: {averageGain} pirate credits."
            double sum = 0;
            for (int i = 0; i < initialLoot.size() ; i++) {
                int itemLength = initialLoot.get(i).length();
                sum += itemLength;
            }
            double average = sum / initialLoot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }


    }
}
