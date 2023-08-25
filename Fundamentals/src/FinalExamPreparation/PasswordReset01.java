package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Done")){

            if (command.equals("TakeOdd")) {

                StringBuilder rawPassword = new StringBuilder();

                for (int i = 0; i < password.length(); i++) {
                    if (i % 2 != 0) {
                        rawPassword.append(password.charAt(i));
                    }
                }
                password = rawPassword.toString();
                System.out.println(password);

            } else if (command.startsWith("Cut")) {

                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);

                String subs = password.substring(index, index + length);

                password = password.replaceFirst(subs, "");
                System.out.println(password);


            } else if (command.startsWith("Substitute")) {

                String oldWord = command.split(" ")[1];
                String newWord = command.split(" ")[2];

                if (password.contains(oldWord)){
                    password = password.replaceAll(oldWord, newWord);
                    System.out.println(password);
                }else {
                    System.out.println("Nothing to replace!");
                }


            }

            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
