package SetAndMaps.Exercise;

import java.util.*;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int set1size = sizes[0];
        int set2size = sizes[1];

        Set<Integer> numbers1 = new LinkedHashSet<>();

        Set<Integer> numbers2 = new LinkedHashSet<>();

        for (int i = 0; i < set1size; i++) {
            numbers1.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < set2size; i++) {
            numbers2.add(Integer.parseInt(scanner.nextLine()));
        }

        numbers1.retainAll(numbers2);
        numbers1.forEach(num -> System.out.print(num + " "));

    }
}
