package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < lines; i++) {

            char letters = scanner.nextLine().charAt(0);

            //Character.getNumericValue(letters);

            int num = (int) letters;

            sum += num;

        }

        System.out.printf("The sum equals: %d",sum);

    }
}


