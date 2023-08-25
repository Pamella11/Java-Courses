package List.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1 ; i++) { //3 3 6 1
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1)); // 6 6 1
                numbers.remove(numbers.get(i + 1));
                i = -1;
            }

        }

        for (double number: numbers) {
            DecimalFormat df = new DecimalFormat("0.#");
            System.out.print(df.format(number) + " ");
        }

        //DecimalFormat df = new DecimalFormat("0.#");
      /*  System.out.println(numbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")); */

    }
}
