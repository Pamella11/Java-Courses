package ExamAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];

        int mouseRow = -1;
        int mouseCol = -1;

        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split("");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = data[col];
                if (matrix[row][col].equals("M")) {
                    mouseRow = row;
                    mouseCol = col;
                }
            }
        }

        matrix[mouseRow][mouseCol] = "*";

        String command = scanner.nextLine();

        while (!command.equals("danger")) {
            if (!isValidMove(command, rows, cols, mouseRow, mouseCol)) {
                System.out.println("No more cheese for tonight!");
                matrix[mouseRow][mouseCol] = "M";
                printMatrix(matrix, rows, cols);
                return;
            }

            int currRow = mouseRow;
            int currCol = mouseCol;

            switch (command) {
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "right":
                    mouseCol++;
                    break;
                case "left":
                    mouseCol--;
                    break;
            }
            //If the mouse steps on C – position, it eats the cheese from the field, and the position is marked with  "*"
            if (matrix[mouseRow][mouseCol].equals("C")) {
                matrix[mouseRow][mouseCol] = "*";
                if (isItLastCheese(matrix, rows, cols)){
                    System.out.println("Happy mouse! All the cheese is eaten, good night!");
                    matrix[mouseRow][mouseCol] = "M";
                    printMatrix(matrix, rows, cols);
                    return;
                }
            } else if (matrix[mouseRow][mouseCol].equals("T")) {
                System.out.println("Mouse is trapped!");
                matrix[mouseRow][mouseCol] = "M";
                printMatrix(matrix, rows, cols);
                return;
            } else if (matrix[mouseRow][mouseCol].equals("@")) {
                mouseRow = currRow;
                mouseCol = currCol;
            }


            command = scanner.nextLine();
        }

        System.out.println("Mouse will come back later!");
        matrix[mouseRow][mouseCol] = "M";
        printMatrix(matrix, rows, cols);
    }

    private static boolean isValidMove(String command, int rows, int cols, int mouseRow, int mouseCol) {
        switch (command) {
            case "up":
                if (mouseRow - 1 >= 0) {
                    return true;
                }
                break;
            case "down":
                if (mouseRow + 1 < rows) {
                    return true;
                }
                break;
            case "right":
                if (mouseCol + 1 < cols) {
                    return true;
                }
                break;
            case "left":
                if (mouseCol - 1 >= 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static boolean isItLastCheese(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col].equals("C")) {
                        return false;
                }
            }
        }
        return true;
    }
}