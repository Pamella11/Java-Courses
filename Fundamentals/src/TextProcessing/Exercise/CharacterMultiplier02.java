package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        String input1 = input[0];
        String input2 = input[1];

        int sum = 0;

        if (input1.length() == input2.length()){
            for (int i = 0; i < input1.length(); i++) {
                char symbol1 = input1.charAt(i);
                char symbol2 = input2.charAt(i);
                sum += symbol1 * symbol2;
            }
        } else if (input1.length() > input2.length()) {
            for (int i = 0; i < input2.length(); i++) {
                char symbol1 = input1.charAt(i);
                char symbol2 = input2.charAt(i);
                sum += symbol1 * symbol2;
            }
            for (int i = input2.length(); i < input1.length(); i++) {
                char symbol = input1.charAt(i);
                sum += symbol;
            }
        } else  {
            for (int i = 0; i < input1.length(); i++) {
                char symbol1 = input1.charAt(i);
                char symbol2 = input2.charAt(i);
                sum += symbol1 * symbol2;
            }
            for (int i = input1.length(); i < input2.length(); i++) {
                char symbol = input2.charAt(i);
                sum += symbol;
            }
        }
        System.out.println(sum);

    }
}
