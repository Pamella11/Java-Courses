package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        //2 + 5 + 10 - 2 - 1
        ArrayDeque<String> calculation = new ArrayDeque<>();
        Collections.addAll(calculation, input);

        int result = 0;

        while (calculation.size() > 1){
            // 2 + 2
            int num1 = Integer.parseInt(calculation.poll());
            String operator = calculation.poll();
            int num2 = Integer.parseInt(calculation.poll());

            if (operator.equals("+")){
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            }

            calculation.push(String.valueOf(result));
        }

        System.out.println(result);

    }
}
