package RegularExpressions.Regex.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String digitRegex = "[STARstar]";
        Pattern digitPattern = Pattern.compile(digitRegex);

        String decryptedRegex = "[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*";
        Pattern decryptedPattern = Pattern.compile(decryptedRegex);

        List<String> attackedPlanets = new ArrayList<>();
        int attackedPlanetCounter = 0;

        List<String> destroyedPlanets = new ArrayList<>();
        int destroyedPlanetCounter = 0;

        for (int i = 0; i < n; i++) {

            String encryptedMessage = scanner.nextLine();

            int digitCounter = 0;
            StringBuilder decryptedMessage = new StringBuilder();

            Matcher digitMatcher = digitPattern.matcher(encryptedMessage);

            while (digitMatcher.find()) {
                digitCounter++;
            }

            for (char symbol : encryptedMessage.toCharArray()) {
                char decryptedSymbol = (char) (symbol - digitCounter);
                decryptedMessage.append(decryptedSymbol);
            }

            Matcher decryptedMatcher = decryptedPattern.matcher(decryptedMessage.toString());

            while (decryptedMatcher.find()) {

                String planetName = decryptedMatcher.group("planet");
                int population = Integer.parseInt(decryptedMatcher.group("population"));
                String attackType = decryptedMatcher.group("attackType");
                int soldiersCount = Integer.parseInt(decryptedMatcher.group("soldiers"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                    attackedPlanetCounter++;
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planetName);
                    destroyedPlanetCounter++;
                }
            }

        }

        System.out.println("Attacked planets: " + attackedPlanetCounter);
        if (!attackedPlanets.isEmpty()) {
            Collections.sort(attackedPlanets);
            for (String planet : attackedPlanets) {
                System.out.println("-> " + planet);
            }
        }
        System.out.println("Destroyed planets: " + destroyedPlanetCounter);
        if (!destroyedPlanets.isEmpty()) {
            Collections.sort(destroyedPlanets);
            for (String planet : destroyedPlanets) {
                System.out.println("-> " + planet);
            }
        }


    }
}
