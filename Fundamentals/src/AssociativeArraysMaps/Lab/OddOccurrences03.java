package AssociativeArraysMaps.Lab;

import java.util.*;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> countWords = new LinkedHashMap<>();

        for (String s : words) {

            String word = s.toLowerCase();

            if (!countWords.containsKey(word)) {
                countWords.put(word, 1);
            } else {
                countWords.put(word, countWords.get(word) + 1);
            }
        }

        List<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWords));

    }
}
