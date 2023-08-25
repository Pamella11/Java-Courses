package FunctionalProgramming.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        StringJoiner commaJoiner = new StringJoiner(", ");

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(Object::toString)
                .forEach(commaJoiner::add);

        System.out.println(commaJoiner.toString());

        StringJoiner sortedNumbers = new StringJoiner(", ");

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .map(Object::toString)
                .forEach(sortedNumbers::add);

        System.out.println(sortedNumbers.toString());

    }
}
