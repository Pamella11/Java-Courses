package SetAndMaps.Exercise;

import java.util.*;

public class PopulationCounter_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<String, Map<String, Integer>> countryPopulation = new LinkedHashMap<>();

        while (!data.equals("report")){
            //"city|country|population"
            String [] dataParts = data.split("\\|");

            String city = dataParts[0];
            String country = dataParts[1];
            int population = Integer.parseInt(dataParts[2]);

            countryPopulation.putIfAbsent(country, new LinkedHashMap<>());
            countryPopulation.get(country).put(city, population);

            data = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : countryPopulation.entrySet()) {

            //int totalPopulation = 0;


        }

    }
}
