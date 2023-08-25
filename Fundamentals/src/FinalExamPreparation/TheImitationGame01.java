package FinalExamPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheImitationGame01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        StringBuilder decryptedMessage = new StringBuilder(message);

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {

            String[] commandParts = command.split("\\|");

            switch (commandParts[0]) {
                case "Move":
                    int moves = Integer.parseInt(commandParts[1]);
                    //Move {number of letters}
                    //Moves the first n letters to the back of the string
                    String toAdd = decryptedMessage.substring(0, moves );
                    decryptedMessage.delete(0, moves);
                    decryptedMessage.append(toAdd);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    //Insert {index} {value}":
                    //o	Inserts the given value before the given index in the string
                    decryptedMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    //•"ChangeAll {substring} {replacement}":
                    //o	Changes all occurrences of the given substring with the replacement text
                    String wordForReplacing = commandParts[1];
                    String replacement = commandParts[2];
                    //  Collections.replaceAll(decryptedMessageList, wordForReplacing, replacement);
                    for (int i = 0; i < decryptedMessage.length(); i++) {
                        String symbol = String.valueOf(decryptedMessage.charAt(i));
                        if (symbol.equals(wordForReplacing)) {
                            int index1 = Integer.parseInt(String.valueOf(decryptedMessage.indexOf(symbol)));
                            decryptedMessage.deleteCharAt(index1);
                            decryptedMessage.insert(index1, replacement);
                        }
                    }

                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + decryptedMessage.toString());
    }
}
