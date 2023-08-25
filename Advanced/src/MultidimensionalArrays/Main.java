package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        int cols = 0;

        for (int row = 0; row < rows; row++) {

            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            cols = numbers.length;

            matrix[row] = numbers;

        }

        int[][] newMatrix = new int[rows][cols];

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int num = matrix[row][col];

        for (int row1 = 0; row1 < rows; row1++) {
            for (int col1 = 0; col1 < cols; col1++) {

                newMatrix[row1][col1] = matrix[row1][col1];

                if (matrix[row1][col1] == num) {
                    //int numToChangeRow = row1;
                    // int numToChangeCol = col1;
                    int sum = 0;

                    if (col1 - 1 >= 0 && matrix[row1][col1 - 1] != num) {
                        sum += matrix[row1][col1 - 1];
                    }

                    if (row1 - 1 >= 0 && matrix[row1 - 1][col1] != num) {
                        sum += matrix[row1 - 1][col1];
                    }

                    if (col1 + 1 < cols && matrix[row1][col1 + 1] != num) {
                        sum += matrix[row1][col1 + 1];
                    }

                    if (row1 + 1 < rows && matrix[row1 + 1][col1] != num) {
                        sum += matrix[row1 + 1][col1];
                    }

                    newMatrix[row1][col1] = sum;
                }

            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
