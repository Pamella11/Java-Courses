package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            String command = scanner.nextLine();

            if (command.startsWith("Include")) {

                String coffee = command.split(" ")[1];

                coffeeList.add(coffee);

            } else if (command.startsWith("Remove")) {

                String text = command.split(" ")[1];

                int numberOfCoffeesToRemove = Integer.parseInt(command.split(" ")[2]); // 5
                                                                                            // 6
                if (numberOfCoffeesToRemove < coffeeList.size() && numberOfCoffeesToRemove > 0) {

                    if (text.equals("first")) {
                        for (int j = 0; j < numberOfCoffeesToRemove; j++) {
                            String first = coffeeList.get(0);
                            coffeeList.remove(first);
                        }
                    } else if (text.equals("last")) {
                        for (int j = 0; j < numberOfCoffeesToRemove ; j++) {
                            String first = coffeeList.get(coffeeList.size() - 1);
                            coffeeList.remove(first);
                        }
                    }
                }
            } else if (command.startsWith("Prefer")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                if (index1 >= 0 && index1 < coffeeList.size() && index2 >= 0 && index2 < coffeeList.size()) {
                    String coffee1 = coffeeList.get(index1);
                    String coffee2 = coffeeList.get(index2);
                   coffeeList.set(index1,coffee2);
                   coffeeList.set(index2,coffee1);

                }
            } else if (command.equals("Reverse")) {
                Collections.reverse(coffeeList);
            }

        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));
    }
}
