package InterfacesAndAbstraction.Exercise.FoodShortage_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> people = new LinkedHashMap<>();

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPeople; i++) {

            String[] information = scanner.nextLine().split("\\s+");

            String name = information[0];
            int age = Integer.parseInt(information[1]);

            if (information.length == 4) {
                String id = information[2];
                String birthdate = information[3];
                Citizen citizen = new Citizen(name, age, id, birthdate);
                people.put(name, citizen);
            } else {
                String group = information[2];
                Rebel rebel = new Rebel(name, age, group);
                people.put(name, rebel);
            }
        }

        String name = scanner.nextLine();

        while (!name.equals("End")) {

            if (people.containsKey(name)) {
                Buyer buyer = people.get(name);
                buyer.buyFood();
            }

            name = scanner.nextLine();
        }

        int totalFoodSum = people.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFoodSum);
    }
}
