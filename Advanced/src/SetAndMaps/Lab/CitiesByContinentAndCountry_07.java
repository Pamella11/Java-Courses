package SetAndMaps.Lab;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!continents.containsKey(continent)) {
                continents.put(continent, new LinkedHashMap<>());
                continents.get(continent).put(country, new ArrayList<>());
                continents.get(continent).get(country).add(city);
            } else {
                if (!continents.get(continent).containsKey(country)) {
                    continents.get(continent).put(country, new ArrayList<>());
                    continents.get(continent).get(country).add(city);
                } else {
                    continents.get(continent).get(country).add(city);
                }
            }

        }

        for (Map.Entry<String, Map<String, List<String>>> continent : continents.entrySet()) {
            System.out.println(continent.getKey() + ":");
            for (Map.Entry<String, List<String>> country : continent.getValue().entrySet()) {
                System.out.println(country.getKey() + " -> " + String.join(", ", country.getValue()));
            }

        }

    }
}
