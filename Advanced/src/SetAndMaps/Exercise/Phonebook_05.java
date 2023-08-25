package SetAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String[] parts = input.split("-");

            String name = parts[0];
            String number = parts[1];

            phoneBook.put(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")) {

            if (phoneBook.containsKey(input)) {
                System.out.println(input + " -> " + phoneBook.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }

            input = scanner.nextLine();
        }
    }
}
