package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int tosses = Integer.parseInt(scanner.nextLine());

        //ArrayDeque<String> players = new ArrayDeque<>();
        PriorityQueue<String> players = new PriorityQueue<>();

        Collections.addAll(players, names);
        int count = 1;

        while (players.size() != 1) {

            for (int i = 1; i < tosses; i++) {
                String player = players.poll();
                players.offer(player);
            }

            if (!isPrime(count)) {
                String playerToRemove = players.poll();
                System.out.println("Removed " + playerToRemove);
            } else {
                String primePlayer = players.peek();
                System.out.println("Prime " + primePlayer);
            }

            count++;
        }

        System.out.println("Last is " + players.poll());
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

