package MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class  MaximumSumOf2x2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = numbers;
        }

        int maxSum = Integer.MIN_VALUE;

        List<Integer> subMatrix = new ArrayList<>();

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int n1 = matrix[row][col];
                int n2 = matrix[row][col + 1];
                int n3 = matrix[row + 1][col];
                int n4 = matrix[row + 1][col + 1];

                int sum = n1 + n2 + n3 + n4;

                if (sum > maxSum){

                    subMatrix.clear();

                    maxSum = sum;

                    subMatrix.add(n1);
                    subMatrix.add(n2);
                    subMatrix.add(n3);
                    subMatrix.add(n4);
                }
            }
        }

        for (int i = 0; i < subMatrix.size(); i+=2) {
            System.out.print(subMatrix.get(i) + " " + subMatrix.get(i + 1));
            System.out.println();
        }

        System.out.println(maxSum);

    }
}

