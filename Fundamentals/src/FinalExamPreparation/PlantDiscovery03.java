package FinalExamPreparation;

import java.util.*;

public class PlantDiscovery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> rarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] command = scanner.nextLine().split("<->");
            //"{plant}<->{rarity}"
            String name = command[0];
            int rarity = Integer.parseInt(command[1]);
            rarityMap.put(name, rarity);
            ratingMap.put(name, new ArrayList<>());
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")){

            String[] inputParts = input.split("\\s?[:-]\\s?");

            String command = inputParts[0];
            String plant = inputParts[1];

            if (ratingMap.containsKey(plant)){

                if (command.equals("Rate")){
                    double rating = Double.parseDouble(inputParts[2]);
                    //add the given rating to the plant (store all ratings)
                    ratingMap.get(plant).add(rating);
                } else if (command.equals("Update")) {
                    //update the rarity of the plant with the new one
                    int rarity = Integer.parseInt(inputParts[2]);
                    rarityMap.put(plant, rarity);
                } else if (command.equals("Reset")) {
                    //remove all the ratings of the given plant
                    ratingMap.get(plant).clear();
                }

            } else {
                System.out.println("error");
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Double>> plant : ratingMap.entrySet()) {
            Double average = plant.getValue().stream().mapToDouble(val -> val).average().orElse(0.0);
            //- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant.getKey(), rarityMap.get(plant.getKey()), average);
        }

    }
}
