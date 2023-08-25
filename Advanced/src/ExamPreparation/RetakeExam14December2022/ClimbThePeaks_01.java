package ExamPreparation.RetakeExam14December2022;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbThePeaks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dailyPortions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //for the next 7 days
        int[] dailyStamina = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> deck = new ArrayDeque<>();

        for (int portion : dailyPortions) {
            stack.push(portion);
        }

        for (int stamina : dailyStamina) {
            deck.offer(stamina);
        }

        int[] peaks = {80, 90, 100, 60, 70};

        int conquered = 0;
        int unconquered = 0;

        boolean isConquered = false;

        String[] peaksToConquer = {"Vihren", "Kutelo", "Banski Suhodol", "Polezhan", "Kamenitza"};

        List<String> conqueredPeaks = new LinkedList<>();

        int days = 0;

        for (int i = 0; i < 7; i++) {

            int peak = peaks[days];

            int portion = stack.pop();
            int stamina = deck.poll();

            if (portion + stamina >= peak) {
                conquered += 1;
                conqueredPeaks.add(peaksToConquer[days]);
            } else {
                unconquered += 1;
                days -= 1;
            }

            if (conquered == 5) {
                isConquered = true;
                break;
            }

            days++;
        }

        if (isConquered) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if (!conqueredPeaks.isEmpty()) {
            System.out.println("Conquered peaks:");
            conqueredPeaks.forEach(System.out::println);
        }

    }
}
