package ExamPreparation;

import java.util.*;

public class Demo {
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

        while (!deckPlates.isEmpty() && !stackCars.isEmpty()){

            int plate = deckPlates.poll();
            int car = stackCars.pop();
            int result = car * 2;

            if (result == plate){
                registeredCars += car;
            } else if (result < plate) {
                int remainingPlates = plate - result;
                registeredCars += car;
                deckPlates.offer(remainingPlates);
            } else {
                int remaining = plate / 2;
                registeredCars += remaining;
                int remainingCars = car - remaining;
                stackCars.addLast(remainingCars);
            }
            daysCounter ++;
        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, daysCounter);
        if (!deckPlates.isEmpty()){
            int sum = 0;
            for (int plates: deckPlates) {
                sum += plates;
            }
            System.out.println(sum + " license plates remain!");
        } else if (!stackCars.isEmpty()) {
            int sum = 0;
            for (int car: stackCars) {
                sum += car;
            }
            System.out.println(sum + " cars remain without license plates!");
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }
}
