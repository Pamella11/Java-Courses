package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());

        List<Integer> wagonSpace = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < wagonSpace.size(); i++) {

            int wagon = wagonSpace.get(i);

            while (wagon != 4 ) {

                if (peopleWaiting == 0) {
                    System.out.println("The lift has empty spots!");
                    System.out.println(wagonSpace.toString().replaceAll("[\\[\\],]", ""));
                    return;
                }

                peopleWaiting -= 1;

                wagon += 1;

                wagonSpace.set(i, wagon);

            }
            if (peopleWaiting > 0 && i == wagonSpace.size() - 1) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
                System.out.println(wagonSpace.toString().replaceAll("[\\[\\],]", ""));
                return;
            }

        }
        System.out.println(wagonSpace.toString().replaceAll("[\\[\\],]", ""));
    }
}
