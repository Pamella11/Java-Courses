package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersToAdd = scanner.nextInt();
        int numbersToPoll = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbersToAdd; i++) {
            queue.add(scanner.nextInt());
        }

        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        if (queue.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
