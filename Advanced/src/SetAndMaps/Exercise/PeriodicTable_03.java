package SetAndMaps.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            elements.addAll(Arrays.asList(input));

        }

        elements.forEach(el -> System.out.print(el + " "));
    }
}
