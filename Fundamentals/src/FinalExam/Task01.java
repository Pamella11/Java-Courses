package FinalExam;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")){

            if (input.startsWith("Change")){

                String word = input.split(" ")[1];
                String replaceWord = input.split(" ")[2];

                text = text.replaceAll(word, replaceWord);
                System.out.println(text);

            } else if (input.startsWith("Includes")){

                String word = input.split(" ")[1];

                if (text.contains(word)){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (input.startsWith("End")) {

                String word = input.split(" ")[1];

                if (text.endsWith(word)){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (input.equals("Uppercase")) {
                text = text.toUpperCase();
                System.out.println(text);

            } else if (input.startsWith("FindIndex")) {

                String symbol = input.split(" ")[1];

                int index = text.indexOf(symbol);

                System.out.println(index);
            } else if (input.startsWith("Cut")) {

                int index = Integer.parseInt(input.split(" ")[1]);
                int count = Integer.parseInt(input.split(" ")[2]);

                text = text.substring(index, index + count); //

                System.out.println(text);

            }


            input = scanner.nextLine();
        }
    }
}
