package TextProcessing.Exercise;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username:usernames) {
            if (validLength(username) && validContain(username)){
                System.out.println(username);
            }
        }

    }
    private static boolean validLength (String username){

        return username.length() > 3 && username.length() < 16;
    }

    private static boolean validContain (String username) {

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}

