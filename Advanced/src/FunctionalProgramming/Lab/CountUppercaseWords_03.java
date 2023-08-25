package FunctionalProgramming.Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));

        List<String> uppercaseWords = new LinkedList<>();

        for (String word: text) {

        if (isUppercase.test(word)){
            uppercaseWords.add(word);
        }
        }

        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(System.out::println);
    }
}
