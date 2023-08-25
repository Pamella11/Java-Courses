package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindEvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int lowerBound = numbers.get(0);
        int upperBound = numbers.get(1);

        extracted(scanner, lowerBound, upperBound);
    }

    private static void extracted(Scanner scanner, int lowerBound, int upperBound) {
        String command = scanner.nextLine();

        if (command.equals("odd")){
            for (int i = lowerBound; i <= upperBound; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (command.equals("even")) {
            for (int i = lowerBound; i <= upperBound; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
