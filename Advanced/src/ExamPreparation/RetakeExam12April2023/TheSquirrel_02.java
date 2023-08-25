package ExamPreparation.RetakeExam12April2023;

import java.util.Arrays;
import java.util.Scanner;

public class TheSquirrel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(", ");

        String[][] matrix = new String[size][size];

        int squirrelRow = -1;
        int squirrelCol = -1;

        for (int row = 0; row < size; row++) {
            String[] data = scanner.nextLine().split("");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = data[col];
                if (matrix[row][col].equals("s")) {
                    squirrelRow = row;
                    squirrelCol = col;
                }
            }
        }

        int hazelnutsCounter = 0;

        for (int i = 0; i < commands.length; i++) {

            if (!isValidMove(commands[i], size, squirrelRow, squirrelCol)) {
                System.out.println("The squirrel is out of the field.");
                System.out.println("Hazelnuts collected: " + hazelnutsCounter);
                return;
            }

            switch (commands[i]) {
                case "up":
                    squirrelRow--;
                    break;
                case "down":
                    squirrelRow++;
                    break;
                case "right":
                    squirrelCol++;
                    break;
                case "left":
                    squirrelCol--;
                    break;
            }

            if (matrix[squirrelRow][squirrelCol].equals("h")) {
                hazelnutsCounter += 1;
                matrix[squirrelRow][squirrelCol] = "*";
            } else if (matrix[squirrelRow][squirrelCol].equals("t")) {
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                System.out.println("Hazelnuts collected: " + hazelnutsCounter);
                return;
            }

            if (hazelnutsCounter == 3) {
                System.out.println("Good job! You have collected all hazelnuts!");
                System.out.println("Hazelnuts collected: " + hazelnutsCounter);
                return;
            }
        }

        System.out.println("There are more hazelnuts to collect.");
        System.out.println("Hazelnuts collected: " + hazelnutsCounter);
    }

    private static boolean isValidMove(String command, int size, int squirrelRow, int squirrelCol) {
        switch (command) {
            case "up":
                if (squirrelRow - 1 >= 0) {
                    return true;
                }
                break;
            case "down":
                if (squirrelRow + 1 < size) {
                    return true;
                }
                break;
            case "right":
                if (squirrelCol + 1 < size) {
                    return true;
                }
                break;
            case "left":
                if (squirrelCol - 1 >= 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
