package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);

        int[][] matrix = new int[size][size];

        String type = input[1];

        if (type.equals("A")) {
            fillTheMatrixPatternA(size, matrix);
        } else if (type.equals("B")) {
            fillTheMatrixPatternB(size, matrix);
        }

        printMatrix(matrix, size);

    }

    private static void fillTheMatrixPatternA(int size, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }

    private static void fillTheMatrixPatternB(int size, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
                }
            } else {
                for (int row = size - 1; row >= 0 ; row--) {
                matrix[row][col] = counter;
                counter++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix, int size){

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
