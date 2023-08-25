package FunctionalProgramming.Exercise;

import java.util.*;

public class ThePartyReservationFilterModule_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>(List.of(scanner.nextLine().split("\\s+")));

        String input = scanner.nextLine();

        List<String> removedNames = new ArrayList<>(names);

        while (!input.equals("Print")) {

            String[] inputParts = input.split(";");

            String command = inputParts[0];
            String filterType = inputParts[1];
            String filterParameter = inputParts[2];

            if (command.equals("Add filter")) {
                switch (filterType) {
                    case "Starts with":
                        names.removeIf(name -> name.startsWith(filterParameter));
                        break;
                    case "Ends with":
                        names.removeIf(name -> name.endsWith(filterParameter));
                        break;
                    case "Length":
                        int length = Integer.parseInt(filterParameter);
                        names.removeIf(name -> name.length() == length);
                        break;
                    case "Contains":
                        names.removeIf(name -> name.contains(filterParameter));
                        break;
                }
            } else if (command.equals("Remove filter")) {
                switch (filterType) {
                    case "Starts with":
                        removedNames.forEach(name ->
                        {
                            if (name.startsWith(filterParameter)) {
                                names.add(name);
                            }
                        });
                        break;
                    case "Ends with":
                        removedNames.forEach(name ->
                        {
                            if (name.endsWith(filterParameter)) {
                                names.add(name);
                            }
                        });
                        break;
                    case "Length":
                        int length = Integer.parseInt(filterParameter);
                        removedNames.forEach(name ->
                        {
                            if (name.length() == length) {
                                names.add(name);
                            }
                        });
                        break;
                    case "Contains":
                        removedNames.forEach(name ->
                        {
                            if (name.contains(filterParameter)) {
                                names.add(name);
                            }
                        });
                        break;
                }
            }

            input = scanner.nextLine();
        }

        removedNames.retainAll(names);

        if (!removedNames.isEmpty()) {
            System.out.println(String.join(" ", removedNames));
        }
    }
}
