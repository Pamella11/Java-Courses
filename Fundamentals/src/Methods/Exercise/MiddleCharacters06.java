package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        middleCharacter(text);

    }

    public static void middleCharacter (String word) {

        int length = word.length();

        if (word.length() % 2 == 0) {
            char symbol = word.charAt((length -1) / 2);
            char nextSymbol = word.charAt(length / 2);
            System.out.printf("%s%s", symbol, nextSymbol);
        } else {
            char oddSymbol = word.charAt((length - 1) / 2);
            System.out.println(oddSymbol);
        }

        }
    }

