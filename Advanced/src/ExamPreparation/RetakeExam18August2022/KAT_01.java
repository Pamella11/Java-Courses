package ExamPreparation.RetakeExam18August2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KAT_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] licensePlates = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] cars = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stackCars = new ArrayDeque<>();
        ArrayDeque<Integer> deckPlates = new ArrayDeque<>();

        for (int num: cars) {
            stackCars.push(num);
        }

        for (int num: licensePlates) {
            deckPlates.offer(num);
        }

        int daysCounter = 0;
        int registeredCars = 0;

        while (!deckPlates.isEmpty()){

            if (stackCars.isEmpty()){
                break;
            }

            int plate = deckPlates.poll(); // 40
            int car = stackCars.pop(); // 40
            // 1 car -> 2 plates
            int result = car * 2; // 40 * 2 = 80

            if (result == plate){
                registeredCars += car;
            } else if (result < plate) {
                int remainingPlates = plate - result;
                registeredCars += car;
                //-> 33 cars and 100 license plates -> 66 license plates for 33 cars -> Add 33 cars to count of registered cars ->
                // The rest (34) license plates are moved to the end of sequence.
                deckPlates.offerLast(remainingPlates);
            } else {
                int remaining = plate / 2;
                registeredCars += remaining;
                int remainingCars = car - remaining;
                stackCars.addLast(remainingCars);
                //(Day 3) -> 40 cars and 40 plates -> 40 plates for 20 cars ->
                // Add 20 cars to count of registered cars -> The rest (20) cars were moved in beginning of sequance.
            }
            daysCounter ++;
        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, daysCounter);
        if (!deckPlates.isEmpty()){
            int sum = 0;
            for (int plates: deckPlates) {
                sum += plates;
            }
            //“{count of plates} license plates remain!”
            System.out.println(sum + " license plates remain!");
        } else if (!stackCars.isEmpty()) {
            int sum = 0;
            for (int car: stackCars) {
                sum += car;
            }
            //“{count of cars without license plates} cars remain without license plates!”
            System.out.println(sum + " cars remain without license plates!");
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }

    }
}
