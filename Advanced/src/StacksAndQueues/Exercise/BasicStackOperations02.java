package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToPush = scanner.nextInt();
        int elementsToPop = scanner.nextInt();
        int elementsToCheck = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            numbers.push(scanner.nextInt());
        }

        for (int i = 0; i < elementsToPop; i++) {
            numbers.pop();
        }

        if (numbers.contains(elementsToCheck)){
            System.out.println("true");
        } else {
            if (numbers.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(numbers));
            }

        }

    }
}
