package FinalExamPreparation;

import java.util.Scanner;

public class SecretChat01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] commandParts = input.split(":\\|:");

            String command = commandParts[0];

            switch (command) {

                case "InsertSpace":

                    int index = Integer.parseInt(commandParts[1]);
                    StringBuilder help = new StringBuilder(message);
                    message = help.insert(index, " ").toString();
                    System.out.println(message);
                    break;

                case "Reverse":
                    String word = commandParts[1];
                    if (message.contains(word)) {
                        message = message.replaceFirst(word, "");
                        String reversedString = "";
                        for (int i = word.length() - 1; i >= 0; i--) {
                            reversedString += word.charAt(i);
                        }
                        message = message + reversedString;
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subWord = commandParts[1];
                    String replaceWord = commandParts[2];
                    message = message.replaceAll(subWord, replaceWord);
                    System.out.println(message);
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
