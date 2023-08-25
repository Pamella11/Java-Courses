package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];
        fillTheMatrix(rows, cols, matrix);
        printTheMatrix(rows,cols,matrix);

    }

    private static void fillTheMatrix(int rows, int cols, String[][] matrix) {

        char letter = 'a';

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + letter + (char) (letter + col) + letter;
                matrix[row][col] = (palindrome);
            }
            letter = (char) (letter + 1);
        }
    }

    private static void printTheMatrix (int rows, int cols, String[][] matrix) {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
