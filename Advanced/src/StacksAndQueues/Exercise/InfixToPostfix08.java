package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        //НЕ Е ПРАВИЛНО РЕШЕНИЕТО :(

        ArrayDeque<Character> numbersQueue = new ArrayDeque<>();
        ArrayDeque<Character> operatorStack = new ArrayDeque<>();

        for (char symbol:operation.toCharArray()) {

            if ((symbol > 47 && symbol < 58) || (symbol > 96 && symbol < 123)) {
                numbersQueue.offer(symbol);
            } else if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                //+, -, *, / and brackets ( or ).
                operatorStack.push(symbol);
            }
        }

        ArrayDeque<Character> finalQueue = new ArrayDeque<>();

        for (char symbol:numbersQueue) {
            finalQueue.offer(symbol);
        }
        for (char symbol:operatorStack) {
            finalQueue.offer(symbol);
        }

        for (char symbol:finalQueue) {
            System.out.print(symbol + " ");
        }
    }
}
