package SetAndMaps.Exercise;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> decks = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String[] parts1 = input.split(": ");

            String player = parts1[0];

            String[] cards = parts1[1].split(", ");

            if (!decks.containsKey(player)) {
                decks.put(player, new LinkedHashSet<>());
                for (String card : cards) {
                    decks.get(player).add(card);
                }
            } else {
                for (String card : cards) {
                    decks.get(player).add(card);
                }
            }

            input = scanner.nextLine();
        }

        extracted(decks);

    }

    private static void extracted(Map<String, Set<String>> decks) {
        for (Map.Entry<String, Set<String>> entry : decks.entrySet()) {
            int totalValue = 0;

            for (String symbol : entry.getValue()) {
                int value = 0;

                if (symbol.charAt(0) == '2') {
                    value += 2;
                } else if (symbol.charAt(0) == '3') {
                    value += 3;
                } else if (symbol.charAt(0) == '4') {
                    value += 4;
                } else if (symbol.charAt(0) == '5') {
                    value += 5;
                } else if (symbol.charAt(0) == '6') {
                    value += 6;
                } else if (symbol.charAt(0) == '7') {
                    value += 7;
                } else if (symbol.charAt(0) == '8') {
                    value += 8;
                } else if (symbol.charAt(0) == '9') {
                    value += 9;
                } else if (symbol.charAt(0) == 'J') {
                    value += 11;
                } else if (symbol.charAt(0) == 'Q') {
                    value += 12;
                } else if (symbol.charAt(0) == 'K') {
                    value += 13;
                } else if (symbol.charAt(0) == 'A') {
                    value += 14;
                } else {
                    value += 10;
                }
                //(S -> 4, H-> 3, D -> 2, C -> 1)
                if (symbol.charAt(symbol.length() - 1) == 'S') {
                    value *= 4;
                } else if (symbol.charAt(symbol.length() - 1) == 'H') {
                    value *= 3;
                } else if (symbol.charAt(symbol.length() - 1) == 'D') {
                    value *= 2;
                } else if (symbol.charAt(symbol.length() - 1) == 'C') {
                    value *= 1;
                }
                totalValue += value;
            }


            System.out.printf("%s: %d%n", entry.getKey(), totalValue);
        }
    }
}
