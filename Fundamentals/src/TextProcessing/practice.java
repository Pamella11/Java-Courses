package TextProcessing;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder transformedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            //qqqwerqwecccwd -> qwerqwecwd
            if (text.charAt(i) != text.charAt(i + 1)) {
                transformedText.append(text.charAt(i));
            }
        }
        System.out.println(transformedText);



       }
    }

