package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }

    }

    public static boolean isPalindrome (String number) {

        String palindromeNumber = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            palindromeNumber += number.charAt(i);
        }

        return palindromeNumber.equals(number);

    }



}


