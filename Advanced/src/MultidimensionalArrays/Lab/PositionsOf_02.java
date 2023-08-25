package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] matrixInfo = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixInfo[0];
        int cols = matrixInfo[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] rowInfo = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowInfo;
        }

        int number = Integer.parseInt(scanner.nextLine());

        boolean isNumberInMatrix = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == number){
                    isNumberInMatrix = true;
                    System.out.println(row + " " + col);
                }
            }
        }

        if (!isNumberInMatrix){
            System.out.println("not found");
        }
    }
}
