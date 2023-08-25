package ExamPreparation.RetakeExam18August2022;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];

        int playerRow = -1;
        int playerCol = -1;

        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                if (col < data.length){
                    matrix[row][col] = data[col];
                } else {
                    matrix[row][col] = "-";
                }
                if (matrix[row][col].equals("Y")) {
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

        List<String> commandsList = new LinkedList<>();

        String command = scanner.nextLine();

        boolean isTreasureFound = false;

        while (!command.equals("Finish")) {

            if (!isValidMove(command, rows, cols, playerRow, playerCol)) {
                command = scanner.nextLine();
                continue;
            }
            int currRow = playerRow;
            int currCol = playerCol;

            switch (command) {
                case "up":
                    playerRow--;
                    break;
                case "down":
                    playerRow++;
                    break;
                case "right":
                    playerCol++;
                    break;
                case "left":
                    playerCol--;
                    break;
            }

            if (matrix[playerRow][playerCol].equals("T")){
                playerRow = currRow;
                playerCol = currCol;
            } else if (matrix[playerRow][playerCol].equals("X")) {
                commandsList.add(command);
                isTreasureFound = true;
            } else {
                if (!isTreasureFound) {
                    commandsList.add(command);
                }
            }

            command = scanner.nextLine();
        }

        if (isTreasureFound){
            System.out.println("I've found the treasure!");
            System.out.println("The right path is " + String.join(", ", commandsList));
        } else {
            System.out.println("The map is fake!");
        }

    }

    private static boolean isValidMove(String command, int rows, int cols, int squirrelRow, int squirrelCol) {
        switch (command) {
            case "up":
                if (squirrelRow - 1 >= 0) {
                    return true;
                }
                break;
            case "down":
                if (squirrelRow + 1 < rows) {
                    return true;
                }
                break;
            case "right":
                if (squirrelCol + 1 < cols) {
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
