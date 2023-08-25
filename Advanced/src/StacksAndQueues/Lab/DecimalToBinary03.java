package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class DecimalToBinary03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number == 0){
            System.out.println(number);
        }

        while (number > 0) {

            int rest = number % 2;
            stack.push(rest);
            number = number / 2;
        }

        for (int num : stack) {
            System.out.print(num);
        }
    }
}
