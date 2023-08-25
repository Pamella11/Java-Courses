package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength= lengthCheck(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidConsist = consistCheck(password);
        if (!isValidConsist) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidDigits = digitCheck(password);
        if (!isValidDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidConsist && isValidDigits) {
            System.out.println("Password is valid");
        }

    }

    public static boolean lengthCheck (String password) {

        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean consistCheck (String password) {

            for (char symbol : password.toCharArray()) {
                if (!Character.isLetterOrDigit(symbol)) {
                    return false;
                }
            }
        return true;
    }

    public static boolean digitCheck (String password) {

        int counter = 0;

            for (char symbol : password.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    counter++;
                }
            }

        return counter >= 2;
    }


}
