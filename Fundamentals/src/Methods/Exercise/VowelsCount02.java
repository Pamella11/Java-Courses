package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        text = text.toLowerCase();

        System.out.println(vowelsCounter(text));


    }

    public static int vowelsCounter(String text) {

        int counter = 0;

        for (int i = 0; i <= text.length() - 1; i++) {

            char letter = text.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' //||
                   // letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                    ) {
                counter++;
            }

        }

        return counter;


    }
}
