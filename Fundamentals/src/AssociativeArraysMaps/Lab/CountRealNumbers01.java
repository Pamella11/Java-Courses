package AssociativeArraysMaps.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        TreeMap<Integer, Integer> countNumbers = new TreeMap<>();

        for (int number: numbers) {
            if (!countNumbers.containsKey(number)) {
                countNumbers.put(number, 1);
            }else {
                countNumbers.put(number, countNumbers.get(number) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countNumbers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
