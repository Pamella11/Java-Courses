package Methods.Lab;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        repeatedText(text, repeatTimes);

    }

    public static void repeatedText (String text, int times) {

        String repeated = "";

        for (int i = 0; i < times ; i++) {

            repeated += text;
        }

        System.out.println(repeated);
    }

}
