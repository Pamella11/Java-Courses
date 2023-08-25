package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        charactersBetweenTwo(symbol1, symbol2);


    }

    public static void charactersBetweenTwo (char symbol, char symbol2) {

        if (symbol < symbol2) {
        for (int j = symbol + 1; j < symbol2; j++) {
            char letter = (char) j;
            System.out.print(letter + " ");
        }
       } else {
            for (int i = symbol2 + 1; i < symbol; i++) {
                char letter = (char) i;
                System.out.print(letter + " ");
            }

            }
        }

    }

