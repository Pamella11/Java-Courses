package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String command = input.split(">>>")[0];

            if (command.equals("Contains")){
                //•	"Contains>>>{substring}":
                String word = input.split(">>>")[1];
                //o	If the raw activation key contains the given substring, prints:
                // "{raw activation key} contains {substring}".
                //o	Otherwise, prints: "Substring not found!"
                if (key.contains(word)){
                    System.out.printf("%s contains %s%n", key, word);
                }else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {
                //•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                String type = input.split(">>>")[1];
                int start = Integer.parseInt(input.split(">>>")[2]);
                int end = Integer.parseInt(input.split(">>>")[3]);
                //o	Changes the substring between the given indices (the end index is exclusive)
                // to upper or lower case and then prints the activation key.
                if (type.equals("Upper")){
                 String  upper = key.substring(start, end).toUpperCase();
                 key = key.replace(key.substring(start, end), upper);
                } else if (type.equals("Lower")) {
                    String lower = key.substring(start, end).toLowerCase();
                    key = key.replace(key.substring(start, end), lower);
                }
                System.out.println(key);
            } else if (command.equals("Slice")) {
                //•	"Slice>>>{startIndex}>>>{endIndex}":
                int start = Integer.parseInt(input.split(">>>")[1]);
                int end = Integer.parseInt(input.split(">>>")[2]);
                //o	Deletes the characters between the start and end indices (the end index is exclusive)
                // and prints the activation key.
                String toDelete = key.substring(start, end);
                key = key.replace(toDelete, "");
                System.out.println(key);
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
