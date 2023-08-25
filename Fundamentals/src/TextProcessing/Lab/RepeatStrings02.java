package TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" ");

        StringBuilder repeatedWord = new StringBuilder();

        for (String word : words) {
            repeatedWord.append(word.repeat(word.length()));
        }

        System.out.println(repeatedWord);
    }
}
