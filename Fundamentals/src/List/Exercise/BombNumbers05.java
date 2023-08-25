package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> specialNumber = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int specialNum = specialNumber.get(0);
        int power = specialNumber.get(1);

        while (numbers.contains(specialNum)) {

            int index = numbers.indexOf(specialNum);

            int leftDetonate = index - power;
            int rightDetonate = index + power;

            if (leftDetonate < 0) {
                leftDetonate = 0;
            }
            if (rightDetonate > numbers.size() - 1) {
                rightDetonate = numbers.size() - 1;
            }

            numbers.subList(leftDetonate, rightDetonate + 1).clear();
        }

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);

    }
}
