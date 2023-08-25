package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> languageCountMap = new LinkedHashMap<>();
        Map<String, Integer> pointsMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")){

            String[] inputInfo = input.split("-");
            String username = inputInfo[0];
            String language = inputInfo[1];

            if (input.endsWith("banned")){
               pointsMap.remove(username);
               break;
            }

            int points = Integer.parseInt(inputInfo[2]);

            if (!pointsMap.containsKey(username)){
                pointsMap.put(username, points);
            } else {
                if (points > pointsMap.get(username)){
                    pointsMap.put(username, points);
                }
            }

            if (!languageCountMap.containsKey(language)) {
                languageCountMap.put(language, 1);
            } else {
                languageCountMap.put(language, languageCountMap.get(language) + 1);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : pointsMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
