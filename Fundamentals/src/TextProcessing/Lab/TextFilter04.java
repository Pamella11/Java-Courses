package TextProcessing.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        StringBuilder replaceWord = new StringBuilder();

        for (String word : bannedWords) {
            replaceWord.append("*".repeat(word.length()));
           text = text.replace(word,replaceWord);
           replaceWord.delete(0, word.length());
           //replaceWord.setLength(0);
        }
        System.out.println(text);
    }
}
