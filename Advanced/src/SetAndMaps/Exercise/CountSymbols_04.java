package SetAndMaps.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolCounter = new TreeMap<>();

        for (char symbol:text.toCharArray()) {

           if (symbolCounter.containsKey(symbol)){
               int curr = symbolCounter.get(symbol);
               symbolCounter.put(symbol, curr + 1);
           } else {
               symbolCounter.put(symbol, 1);
           }

        }

        for (Map.Entry<Character, Integer> entry : symbolCounter.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }

    }
}
