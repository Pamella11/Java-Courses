package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> hearts = Arrays
                .stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        int startPosition = 0;

        while (!command.equals("Love!")) {

            if (command.startsWith("Jump")) {

                int jumpLength = Integer.parseInt(command.split(" ")[1]);

                startPosition += jumpLength;

                if (startPosition >= hearts.size()) {
                    startPosition = 0;
                }

                int heartsLeft = hearts.get(startPosition);

                if (heartsLeft != 0) {

                    hearts.set(startPosition, heartsLeft - 2);

                    if (hearts.get(startPosition) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", startPosition);
                    }
                } else {
                    System.out.printf("Place %d already had Valentine's day.%n", startPosition);
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", startPosition);

        boolean hadValentineDay = true;

        for (Integer house: hearts) {
            if (house != 0) {
                hadValentineDay = false;
                break;
            }
        }

        int counter = 0;

        for (Integer houses: hearts) {
            if (houses != 0) {
                counter ++;
            }
        }

        if (hadValentineDay) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
