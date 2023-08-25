package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (int i = 0; i < input.length; i++) {

            String word = input[i];

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            int num = Integer.parseInt(word.substring(1, word.length() - 1));

            //First Letter:
            //•	If it's uppercase, you divide the number by the letter's position in the alphabet.
            //•	If it's lowercase, you multiply the number with the letter's position in the alphabet.
            if (firstLetter > 64 && firstLetter < 91) {
                double position = firstLetter - 64;
                sum += num / position;
            } else {
                double position = firstLetter - 96;
                sum += num * position;
            }
            //Last Letter:
            //•	If it's uppercase, you subtract its position from the resulted number.
            //•	If it's lowercase, you add its position to the resulted number.
            if (lastLetter > 64 && lastLetter < 91){
                double position = lastLetter - 64;
                sum -= position;
            } else {
                double position = lastLetter - 96;
                sum += position;
            }

        }
        System.out.printf("%.2f", sum);
    }
}
