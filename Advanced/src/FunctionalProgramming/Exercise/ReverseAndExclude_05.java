package FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int num = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        numbers.removeIf(number -> number % num == 0);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}
