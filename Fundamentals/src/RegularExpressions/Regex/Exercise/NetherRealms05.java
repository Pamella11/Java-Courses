package RegularExpressions.Regex.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList());

        String nameRegex = "[^\\d+\\-*/.]";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern damagePattern = Pattern.compile("(?<number>[+-]?\\d+\\.?\\d*)");

        for (String demonName : input) {

            int totalHealth = 0;
            double totalDamage = 0;

            Matcher matcherName = namePattern.matcher(demonName);
            Matcher damageMatcher = damagePattern.matcher(demonName);

            while (matcherName.find()) {
                char symbol = matcherName.group().charAt(0);
                totalHealth += symbol;
            }
            while (damageMatcher.find()) {
                double damage = Double.parseDouble(damageMatcher.group("number"));
                totalDamage += damage;
            }
            for (char symbol : demonName.toCharArray()) {
                if (symbol == '*') {
                    totalDamage *= 2;
                } else if (symbol == '/') {
                    totalDamage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demonName, totalHealth, totalDamage);

        }

    }
}
