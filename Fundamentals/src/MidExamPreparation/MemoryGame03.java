package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        int moves = 0;

        while (!command.equals("end")){

            String [] commandParts = command.split(" ");

            int index1 = Integer.parseInt(commandParts[0]);
            int index2 = Integer.parseInt(commandParts[1]);

            moves ++;

            if (index1 >= 0 && index1 < elements.size() && index2 >= 0 && index2 < elements.size() && index1 != index2) {

                String element1 = elements.get(index1);
                String element2 = elements.get(index2);

                if (element1.equals(element2)){
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                    elements.remove(element1);
                    elements.remove(element2);
                } else {
                    System.out.println("Try again!");
                }
            } else {
                String elementToAdd = "-" + moves + "a";
                elements.add(elements.size() / 2, elementToAdd);
                elements.add((elements.size() / 2) + 1, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
            }

            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!", moves);
                return;
            }

            command = scanner.nextLine();
        }

        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }

    }
}
