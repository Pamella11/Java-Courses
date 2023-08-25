package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> cityPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        while (!input.equals("Sail")){

            String [] inputParts = input.split("\\|\\|");

            String city = inputParts[0];
            int population = Integer.parseInt(inputParts[1]);
            int gold = Integer.parseInt(inputParts[2]);

            if (!cityPopulation.containsKey(city)){
                cityPopulation.put(city, population);
                cityGold.put(city, gold);
            } else {
                cityPopulation.put(city, cityPopulation.get(city) + population);
                cityGold.put(city, cityGold.get(city) + gold);
            }
            input = scanner.nextLine();
        }

        String action = scanner.nextLine();

        while (!action.equals("End")){

            String[] parts = action.split("=>");
            String event = parts[0];
            String town = parts[1];

            if (event.equals("Plunder")){
                //•	"Plunder=>{town}=>{people}=>{gold}"
                int people = Integer.parseInt(parts[2]);
                int gold = Integer.parseInt(parts[3]);
                //o	You have successfully attacked and plundered the town,
                // killing the given number of people and stealing the respective amount of gold.
                int currentPopulation = cityPopulation.get(town);
                int currentGold = cityGold.get(town);

                int peopleSum = currentPopulation - people;
                int goldSum = currentGold - gold;

                cityPopulation.put(town, peopleSum);
                cityGold.put(town, goldSum);
                //"{town} plundered! {gold} gold stolen, {people} citizens killed."
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                if (peopleSum <= 0 || goldSum <= 0){
                    //"{town} has been wiped off the map!"
                    System.out.println(town + " has been wiped off the map!");
                    cityPopulation.remove(town);
                    cityGold.remove(town);
                }

            } else if (event.equals("Prosper")) {
                //•	"Prosper=>{town}=>{gold}"
                int gold = Integer.parseInt(parts[2]);

                if (gold < 0){
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = cityGold.get(town);
                    cityGold.put(town, currentGold + gold);
                    //"{gold added} gold added to the city treasury. {town} now has {total gold} gold."
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, currentGold + gold);
                }

            }

            action = scanner.nextLine();
        }

        if (!cityPopulation.isEmpty()){
            int count = cityPopulation.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", count);
            //{town1} -> Population: {people} citizens, Gold: {gold} kg
            for (Map.Entry<String, Integer> city : cityPopulation.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", city.getKey(), city.getValue(), cityGold.get(city.getKey()));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
