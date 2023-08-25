package ExamPreparation.Exam18February2023;

import java.util.Arrays;
import java.util.Scanner;

public class BlindMansBuff_02 {
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
                matrix[row][col] = data[col];
                if (matrix[row][col].equals("B")) {
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

        String command = scanner.nextLine();

        int touchedOpponents = 0;
        int movesCounter = 0;

        while (!command.equals("Finish")){

            if (!isValidMove(command, rows, cols, playerRow, playerCol) || isItObstacle(command, playerRow, playerCol, matrix)){
                command = scanner.nextLine();
                continue;
            }

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
                
                if (matrix[playerRow][playerCol].equals("O")){
                    command = scanner.nextLine();
                    continue;
                } else if (matrix[playerRow][playerCol].equals("P")) {
                    touchedOpponents ++;
                    matrix[playerRow][playerCol] = "-";
                }

                movesCounter ++;

                if (touchedOpponents == 3){
                    break;
                }

            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", touchedOpponents, movesCounter);
    }

    private static boolean isItObstacle (String command,int playerRow, int playerCol, String[][] matrix){
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
        if (matrix[playerRow][playerCol].equals("O")){
            return true;
        }
        return false;
    }
    private static boolean isValidMove(String command, int rows, int cols, int playerRow, int playerCol) {
        switch (command) {
            case "up":
                if (playerRow - 1 >= 0) {
                    return true;
                }
                break;
            case "down":
                if (playerRow + 1 < rows) {
                    return true;
                }
                break;
            case "right":
                if (playerCol + 1 < cols) {
                    return true;
                }
                break;
            case "left":
                if (playerCol - 1 >= 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
