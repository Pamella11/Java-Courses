package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            List<String> treasure = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
            //Loot {item1} {item2}…{itemn}":
            if (command.startsWith("Loot")) {
                //o	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
                //o	If an item is already contained, don't insert it.
                for (int i = 1; i < treasure.size(); i++) {
                    String itemToInsert = treasure.get(i);
                    if (!initialLoot.contains(itemToInsert)) {
                        initialLoot.add(0, itemToInsert);
                    }
                }
            } else if (command.startsWith("Drop")) {
                //o	Remove the loot at the given position and add it at the end of the treasure chest.
                //o	If the index is invalid, skip the command.
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (indexToRemove >= 0 && indexToRemove <= initialLoot.size() - 1) {
                    String lootToAdd = initialLoot.get(indexToRemove);
                    initialLoot.remove(indexToRemove);
                    initialLoot.add(lootToAdd);
                }
            } else if (command.startsWith("Steal")) {
                int count = Integer.parseInt(command.split(" ")[1]);
                //o	Someone steals the last count loot items.
                if (count > initialLoot.size()) {
                    count = initialLoot.size();
                }
                List<String> subList = initialLoot.subList(initialLoot.size() - count, initialLoot.size());

                System.out.println(String.join(", ", subList));

                initialLoot.removeAll(subList);
                }

            command = scanner.nextLine();
        }

        if (initialLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            int counter = 0;
            for (int i = 0; i < initialLoot.size(); i++) {
                String item = initialLoot.get(i);
                sum += item.length();
                counter++;
            }
            double treasureGain = sum / counter;
            System.out.printf("Average treasure gain: %.2f pirate credits.", treasureGain);
        }
    }
    }

