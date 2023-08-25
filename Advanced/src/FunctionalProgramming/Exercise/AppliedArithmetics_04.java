package FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //"add" -> adds 1
        Function<List<Integer>, List<Integer>> addFunction = list -> list.stream().map(num -> num + 1).collect(Collectors.toList());

        //"multiply" -> multiplies by 2
        Function<List<Integer>, List<Integer>> multiplyFunction = list -> list.stream().map(num -> num * 2).collect(Collectors.toList());

        //"subtract" -> subtracts 1
        Function<List<Integer>, List<Integer>> subtractFunction = list -> list.stream().map(num -> num - 1).collect(Collectors.toList());

        //"print" -> prints all numbers on a new line
        Consumer<List<Integer>> printFunction = list -> list.forEach(num -> System.out.print(num + " "));

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            switch (command) {

                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractFunction.apply(numbers);
                    break;
                case "print":
                    printFunction.accept(numbers);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
