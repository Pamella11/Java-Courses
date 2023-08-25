package WhileLoop.MoreExercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder word = new StringBuilder();

        int count = 0;

        String letter = "";


        while (!input.equals("End")) {

            char valid = input.charAt(0);

            if ((valid >= 'a' && valid <= 'z') || (valid >= 'A' && valid <= 'Z')) {
                if (input.equals("o") || input.equals("c") || input.equals("n")) {
                    if (input.equals(letter) && count > 0) {
                        word.append(input);
                    } else {
                        count++;
                        letter = input;
                        word.append("");
                    }
                } else {
                    word.append(input);
                }
                if (count == 3) {
                    System.out.print(word + " ");
                    count=0;
                    letter="";
                    word = new StringBuilder();
                }}

            input = scanner.nextLine();
        }


    }
}
