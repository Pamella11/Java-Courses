package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];
        fillTheMatrix(size, matrix, scanner);

        int primaryDiagonalSum = sumOfPrimaryDiagonal(size, matrix);
        int secondaryDiagonalSum = sumOfSecondaryDiagonal(size, matrix);
        int totalSum = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        System.out.println(totalSum);

    }



    public static void fillTheMatrix (int size, int[][] matrix, Scanner scanner){

        for (int row = 0; row < size; row++) {

            String[] numbers = scanner.nextLine().split(" ");

            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }
        }

    }

    public static int sumOfPrimaryDiagonal (int size, int[][] matrix){

        int sum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int sumOfSecondaryDiagonal(int size, int[][] matrix) {

        int sum = 0;

        for (int row = size - 1; row >= 0 ; row--) {
            for (int col = 0; col < size; col++) {
                sum += matrix[row][col];
                row--;
            }
        }
        return sum;
    }




}
