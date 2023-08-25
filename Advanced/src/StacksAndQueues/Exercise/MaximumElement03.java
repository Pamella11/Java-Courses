package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {

            String command = scanner.nextLine();

            if (command.startsWith("1")){
                int numToPush = Integer.parseInt(command.split(" ")[1]);
                stack.push(numToPush);
            } else if (command.equals("2")) {
                stack.pop();
            } else if (command.equals("3")) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
