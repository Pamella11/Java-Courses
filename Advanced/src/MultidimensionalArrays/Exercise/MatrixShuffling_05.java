package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        String[][] matrix = new String[rows][cols];

        fillTheMatrix(rows, cols, matrix, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")){

            if (isCommandValid(command, matrix, cols)) {
                switchingElements(matrix, command, rows, cols);
            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }

    private static void fillTheMatrix (int rows, int cols, String[][] matrix, Scanner scanner){

        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(" ");
            matrix[row] = data;
        }
    }

    private static boolean isCommandValid (String command, String[][] matrix, int cols){

        if (!command.startsWith("swap")){
            return false;
        }

        //swap row1 col1 row2c col2
        String[] commandParts = command.split(" ");

        if (commandParts.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= matrix.length || col1 < 0 || col1 >= cols ||
            row2 < 0 || row2 >= matrix.length || col2 < 0 || col2 >= cols){
            return false;
        }

        return true;
    }

    private static void switchingElements (String [][] matrix, String command, int rows, int cols) {

        String[] commandParts = command.split(" ");

        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        String element1 = matrix[row1][col1];
        String element2 = matrix[row2][col2];

        matrix[row1][col1] = element2;
        matrix[row2][col2] = element1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
