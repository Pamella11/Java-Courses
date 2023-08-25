package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#@])(?<firstWord>[A-Za-z][A-Za-z][A-Za-z]+)\\1\\1(?<secondWord>[A-Za-z][A-Za-z][A-Za-z]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> pairs = new ArrayList<>();

        int counter = 0;

        while (matcher.find()) {

            counter++;

            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder reversed = new StringBuilder(secondWord);
            String reversedWord = reversed.reverse().toString();

            if (firstWord.equals(reversedWord)) {
                String pair = firstWord + " <=> " + secondWord;
                pairs.add(pair);
            }
        }
        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(counter + " word pairs found!");
        }

        if (pairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", pairs));
        }

    }
}
