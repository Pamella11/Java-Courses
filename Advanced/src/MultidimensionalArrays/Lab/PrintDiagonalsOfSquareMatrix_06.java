package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int row = 0; row < rowsAndCols; row++) {

            int [] rowNumbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = rowNumbers;
        }

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                System.out.print(matrix[row][col] + " ");
                row++;
            }
        }
        System.out.println();

        for (int row = rowsAndCols - 1; row >= 0; row--) {
            for (int col = 0; col < rowsAndCols; col++) {
                System.out.print(matrix[row][col] + " ");
                row--;
            }
        }

    }
}
