package FinalExamPreparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([\\:*])\\1(?<word>[A-Z][a-z]{2,})\\1\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String regex1 = "(?<digit>\\d)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(text);

        long sum = 1;

        while (matcher1.find()) {

            long digit = Long.parseLong(matcher1.group("digit"));
            sum *= digit;

        }
            int counter = 0;

        List<String> coolEmojis = new LinkedList<>();

        while (matcher.find()){
            counter ++;
            String word = matcher.group("word");
            int symbolSum = 0;

            for (char symbol:word.toCharArray()) {
                symbolSum += symbol;
            }
            if (symbolSum > sum){
                coolEmojis.add(matcher.group());
            }

        }
        System.out.println("Cool threshold: " + sum);
        System.out.println(counter + " emojis found in the text. The cool ones are:");
        coolEmojis.forEach(System.out::println);
    }
}
