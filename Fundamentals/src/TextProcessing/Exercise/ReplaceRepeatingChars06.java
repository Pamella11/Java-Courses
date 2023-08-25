package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
        //aaaaabbbbbcdddeeeedssaa -> abcdedsa

        String text = scanner.nextLine();

        StringBuilder transformedText = new StringBuilder(text);

        for (int i = 0; i < transformedText.length() - 1; i++) {

            if (transformedText.charAt(i) == transformedText.charAt(i + 1)){
                transformedText.deleteCharAt(i + 1);
                i --;
            }

        }
        System.out.println(transformedText);
    }
}
