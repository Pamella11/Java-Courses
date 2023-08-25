package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbersWithStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String num: numbers) {
            stack.push(num);
        }

        for (String num: stack) {
            System.out.print(stack.pop() + " ");
        }
    }
}
