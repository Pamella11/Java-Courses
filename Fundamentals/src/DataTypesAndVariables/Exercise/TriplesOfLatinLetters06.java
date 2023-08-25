package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i < 'a' + number; i++) {
            for (char j = 'a'; j < 'a' + number ; j++) {
                for (char k = 'a'; k < 'a' + number ; k++) {
                    System.out.printf("%s%s%s%n",i,j,k);
                }
            }
        }

    }
}
