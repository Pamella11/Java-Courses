package FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateParty_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        Collections.addAll(guests, input);

        String command = scanner.nextLine();

        while (!command.equals("Party!")) {

            String[] parts = command.split("\\s+");

            if (parts[0].equals("Remove")) {
                switch (parts[1]) {
                    case "StartsWith":
                        String letter = parts[2];
                        guests.removeIf(name -> name.startsWith(letter));
                        break;
                    case "EndsWith":
                        String letters = parts[2];
                        guests.removeIf(name -> name.endsWith(letters));
                        break;
                    case "Length":
                        int length = Integer.parseInt(parts[2]);
                        guests.removeIf(name -> name.length() == length);
                        break;
                }

            } else if (parts[0].equals("Double")) {
                List<String> guestsToAdd = new ArrayList<>();
                switch (parts[1]) {
                    case "StartsWith":
                        String letter = parts[2];
                        for (String name:guests) {
                            if (name.startsWith(letter)){
                                guestsToAdd.add(name);
                            }
                        }
                        break;
                    case "EndsWith":
                        String letters = parts[2];
                        for (String name:guests) {
                            if (name.endsWith(letters)){
                                guestsToAdd.add(name);
                            }
                        }
                        break;
                    case "Length":
                        int length = Integer.parseInt(parts[2]);

                        for (String name:guests) {
                            if (name.length() == length){
                                guestsToAdd.add(name);
                            }
                        }
                        break;
                }
                guests.addAll(guestsToAdd);
            }
            command = scanner.nextLine();
        }


        if (guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }
    }
}
