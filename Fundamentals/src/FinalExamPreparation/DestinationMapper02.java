package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();

        String regex = "([=\\/])(?<places>[A-Z][A-Za-z][A-Za-z]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        int travelPoints = 0;

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            String place = matcher.group("places");
            destinations.add(place);
            travelPoints += place.length();
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);

    }
}
