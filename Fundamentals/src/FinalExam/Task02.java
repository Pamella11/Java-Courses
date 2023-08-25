package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String message = scanner.nextLine();

            String regex = "^([$%])(?<tag>[A-Z][a-z]{2,})\\1: (\\[(?<num1>\\d+)\\]\\|\\[(?<num2>\\d+)\\]\\|\\[(?<num3>\\d+)\\]\\|$)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);

            if (matcher.find()){
                StringBuilder decryptedMessage = new StringBuilder();

                String tag = matcher.group("tag");

                int num1 = Integer.parseInt(matcher.group("num1"));
                int num2 = Integer.parseInt(matcher.group("num2"));
                int num3 = Integer.parseInt(matcher.group("num3"));

                char symbol1 = (char) num1;
                char symbol2 = (char) num2;
                char symbol3 = (char) num3;

                decryptedMessage.append(symbol1);
                decryptedMessage.append(symbol2);
                decryptedMessage.append(symbol3);

                //o	"{tag}: {decryptedMessage}"
                System.out.printf("%s: %s%n", tag, decryptedMessage.toString());

            } else {
                System.out.println("Valid message not found!");
            }

        }
    }
}
