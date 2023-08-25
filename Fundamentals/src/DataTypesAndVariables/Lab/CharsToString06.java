package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // char delimiter = scanner.next().charAt(0);

        char symbol = scanner.next().charAt(0);
        char symbol1 = scanner.next().charAt(0);
        char symbol2 = scanner.next().charAt(0);

        System.out.printf("%s%s%s", symbol, symbol1, symbol2);


    }
}
