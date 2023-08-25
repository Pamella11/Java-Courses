package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        UnaryOperator<Double> numbersWithVat = num -> num * 1.2;

        System.out.println("Prices with VAT:");
        numbers.forEach(num -> System.out.printf("%.2f%n", numbersWithVat.apply(num)));
    }
}
