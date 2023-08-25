package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!player1.isEmpty() && !player2.isEmpty()) {

            int card1 = player1.get(0);
            int card2 = player2.get(0);
            player1.remove(0);
            player2.remove(0);

            if (card1 > card2) {
                player1.add(card1);
                player1.add(card2);
            } else if (card2 > card1) {
                player2.add(card2);
                player2.add(card1);
            }
        }
        int sum = 0;
        if (player1.isEmpty()) {
            for (Integer cards : player2) {
                sum += cards;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }else {
            for (Integer cards : player1) {
                sum += cards;
            }
            System.out.println("First player wins! Sum: " + sum);

        }

    }
}
