package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {

            char symbol = (char) i;

            System.out.print(symbol + " ");

        }


    }
}
