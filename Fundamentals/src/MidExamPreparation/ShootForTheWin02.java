package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int count = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int index = Integer.parseInt(command);

            if (index >= 0 && index < targets.size()) {
                int target = targets.get(index);
                if (target != -1) {
                    targets.set(index, -1);
                    count++;
                    //Reduce all the other targets, which have greater values than your current target, with its value.
                    //Increase all the other targets, which have less than or equal value to the shot target, with its value.
                    for (int i = 0; i < targets.size(); i++) {
                        int number = targets.get(i);
                        if (number != -1 && number > target) {
                            number -= target;
                            targets.set(i, number);
                        } else if (number != -1 && number <= target) {
                            number += target;
                            targets.set(i, number);
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> " + targets.toString().replaceAll("[\\[\\],]", ""), count);
        //"Shot targets: {count} -> {target1} {target2}… {targetn}"

    }
}
