package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        Map<String, Integer> junks = new LinkedHashMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean hasWon = false;

        while (!hasWon) {

            String[] command = scanner.nextLine().split(" ");

            for (int i = 0; i < command.length; i += 2) {

                int quantity = Integer.parseInt(command[i]);
                String material = command[i + 1].toLowerCase();

                if (materials.containsKey(material)) {
                    materials.put(material, materials.get(material) + quantity);
                } else {
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        junks.put(material, junks.get(material) + quantity);
                    }
                }

                //•	"Shadowmourne" - requires 250 Shards
                //•	"Valanyr" - requires 250 Fragments
                //•	"Dragonwrath" - requires 250 Motes

                for (Map.Entry<String, Integer> entry : materials.entrySet()) {
                    if (entry.getValue() >= 250) {
                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                            entry.setValue(entry.getValue() - 250);
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                            entry.setValue(entry.getValue() - 250);
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                            entry.setValue(entry.getValue() - 250);
                        }
                        hasWon = true;
                        break;
                    }
                }

                if (hasWon) {
                    break;
                }
            }

        }


        for (Map.Entry<String, Integer> material : materials.entrySet()) {
            System.out.println(material.getKey() + ": " + material.getValue());
        }
        for (Map.Entry<String, Integer> junk : junks.entrySet()) {
            System.out.println(junk.getKey() + ": " + junk.getValue());
        }



    }
}

