package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that counts all characters in a string except space (' ').
        //text -> t -> 2
        //        e -> 1
        //        x -> 1

        Map<Character, Integer> lettersCounter = new LinkedHashMap<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == ' ') {
                continue;
            }
            if (!lettersCounter.containsKey(letter)) {
                lettersCounter.put(letter, 1);
            } else {
                lettersCounter.put(letter, lettersCounter.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : lettersCounter.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
