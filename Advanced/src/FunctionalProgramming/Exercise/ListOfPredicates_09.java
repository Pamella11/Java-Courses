package FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        BiPredicate<List<Integer>, Integer> isDivisible = (list, number) -> {
            for (int n : list) {
                if (number % n != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= num ; i++) {
            if (isDivisible.test(numbers, i)){
                System.out.print(i + " ");
            }
        }
    }
}
