package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int tosses = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        Collections.addAll(players, names);

        while (players.size() != 1) {

            for (int i = 1; i < tosses; i++) {
                String player = players.poll();
                players.offer(player);
            }
            String playerToRemove = players.poll();
            System.out.println("Removed " + playerToRemove);

        }
        System.out.println("Last is " + players.poll());
    }
}
