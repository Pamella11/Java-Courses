package TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")){

            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0 ; i--) {

                char letter = word.charAt(i);

                 reversedWord.append(letter);
            }
            System.out.println(word + " = " + reversedWord);

            word = scanner.nextLine();
        }
    }
}
