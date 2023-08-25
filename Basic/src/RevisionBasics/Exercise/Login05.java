package RevisionBasics.Exercise;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String reversed = "";

        int counter = 0;

        int lengthUsername = username.length();

        for (int i = 0; i < lengthUsername; i++) {
            char letter = username.charAt(i);
            reversed = letter + reversed;
        }

        String password = scanner.nextLine();

        while (!password.equals(reversed)) {
            counter++;
            System.out.println("Incorrect password. Try again.");

            if (counter % 3 == 0) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            password = scanner.nextLine();
        }
        if (password.equals(reversed)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}

