package RegularExpressions.Regex.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String racers = scanner.nextLine();
        List<String> racers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        List<String> participantsList = new LinkedList<>();

        String info = scanner.nextLine();

        StringBuilder name = new StringBuilder();

        int distance = 0;

        while (!info.equals("end of race")) {

            for (int i = 0; i < info.length(); i++) {
                char symbol = info.charAt(i);
                if (Character.isLetter(symbol)) {
                    name.append(symbol);
                } else if (Character.isDigit(symbol)) {
                    distance += symbol - 48;
                }
            }
            if (participantsList.contains(String.valueOf(name))){
                distance += distance;
            }
            if (racers. contains(String.valueOf(name))) {
                if (!participantsList.contains(String.valueOf(name))) {
                    participantsList.add(String.valueOf(name));
                }
            }

            name.delete(0, name.length());

            info = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("1st place: " + racers.get(i));
            } else if (i == 1) {
                System.out.println("2nd place: " + racers.get(i));
            } else {
                System.out.println("3rd place: " + racers.get(i));
            }

        }


    }
}
