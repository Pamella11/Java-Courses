package TextProcessing.Lab;

import java.util.Scanner;

public class Substring03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String word = scanner.nextLine();

        while (word.contains(wordToRemove)){

           word = word.replace(wordToRemove, "");

        }

        System.out.println(word);

    }
}
