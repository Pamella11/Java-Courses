package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> oldText = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            if (command.startsWith("1")){
                oldText.push(String.valueOf(text));
                //"1 {string}" - appends [string] to the end of the text.
                String textToAdd = command.split(" ")[1];
                text.append(textToAdd);
            } else if (command.startsWith("2")) {
                oldText.push(String.valueOf(text));
                //"2 {count}" - erases the last [count] elements from the text.
                int count = Integer.parseInt(command.split(" ")[1]);
                text.delete(text.length() - count, text.length() + 1);
            } else if (command.startsWith("3")) {
                //"3 {index}" - returns the element at position [index] from the text
                int position = Integer.parseInt(command.split(" ")[1]);
                System.out.println(text.charAt(position - 1));
            } else if (command.equals("4")) {
              text = new StringBuilder(oldText.pop());

            }

        }
    }
}
