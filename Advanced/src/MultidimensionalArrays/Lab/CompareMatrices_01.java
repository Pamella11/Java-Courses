package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstMatrixInfo = scanner.nextLine().split(" ");

        int rows1 = Integer.parseInt(firstMatrixInfo[0]);
        int cols1 = Integer.parseInt(firstMatrixInfo[1]);

        int[][] firstMatrix = new int[rows1][cols1];

        for (int row = 0; row < rows1; row++) {
            String [] data = scanner.nextLine().split(" ");
            for (int col = 0; col < cols1; col++) {
                firstMatrix[row][col] = Integer.parseInt(data[col]);
            }
        }
        String [] secondMatrixInfo = scanner.nextLine().split(" ");

        int rows2 = Integer.parseInt(secondMatrixInfo[0]);
        int cols2 = Integer.parseInt(secondMatrixInfo[1]);

        int[][] secondMatrix = new int[rows2][cols2];

        for (int row = 0; row < rows2; row++) {
            String[] data = scanner.nextLine().split(" ");
            for (int col = 0; col < cols2; col++) {
                secondMatrix[row][col] = Integer.parseInt(data[col]);
            }
        }

        boolean isEqual = true;

        if (rows1 != rows2 || cols1 != cols2){
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols1; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
