package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MatchingBrackets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5

        String input = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

       // Collections.addAll(stack, input);

        for (int i = 0; i < input.length(); i++) {

           char symbol = input.charAt(i);

           if (symbol == '('){
               stack.push(i);
            } else if (symbol == ')') {
               int startIndex = stack.pop();
               String contests = input.substring(startIndex, i + 1);
               System.out.println(contests);
           }

        }



    }
}
