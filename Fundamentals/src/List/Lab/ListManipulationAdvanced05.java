package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Contains")) {
                //Contains {number} – check if the list contains the number. 
                // If yes, print "Yes", otherwise, print "No such number"
                int number = Integer.parseInt(command.split(" ")[1]);
                if (numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print even")) {
                //Print even – print all the numbers that are even separated by a space
                for (int i = 0; i < numbers.size(); i++) {
                    int number = numbers.get(i);
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (command.equals("Print odd")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            } else if (command.equals("Get sum")) {
                //Get sum – print the sum of all the numbers
                int sum = 0;
                for (int i = 0; i <= numbers.size() - 1 ; i++) {
                    sum += numbers.get(i);
                }
                System.out.println(sum);
            } else if (command.startsWith("Filter")) {
                //Filter {condition} {number} – print all the numbers that fulfill that condition.
                // The condition will be either '<', '>', ">=", "<="
                String condition = command.split(" ")[1];
                int number = Integer.parseInt(command.split(" ")[2]);
                switch (condition) {
                    case "<":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case ">":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        break;
                }
                System.out.println();
            }

            command = scanner.nextLine();
        }

    }
}
