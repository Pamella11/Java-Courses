package SetAndMaps.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> occurrenceOfNumber = new LinkedHashMap<>();

        for (double num : numbers) {

            if (!occurrenceOfNumber.containsKey(num)){
                occurrenceOfNumber.put(num, 1);
            } else {
                int current = occurrenceOfNumber.get(num);
                occurrenceOfNumber.put(num, current + 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : occurrenceOfNumber.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
