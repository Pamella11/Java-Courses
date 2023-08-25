package MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        fillTheMatrix(rows, matrix, scanner);

        List<Integer> subMatrix = new ArrayList<>(fillTheList(rows, cols, matrix));

        int totalSum = totalSumOfSubMatrix(rows, cols, matrix);

        System.out.println("Sum = " + totalSum);

        printTheMatrix(subMatrix);

    }

    private static void fillTheMatrix(int rows, int[][] matrix, Scanner scanner) {

        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = numbers;
        }
    }

    private static List<Integer> fillTheList(int rows, int cols, int[][] matrix) {

        List<Integer> elements = new ArrayList<>();

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows - 2; row++) {

            for (int col = 0; col < cols - 2; col++) {

                int element1 = matrix[row][col];
                int element2 = matrix[row][col + 1];
                int element3 = matrix[row][col + 2];
                int element4 = matrix[row + 1][col];
                int element5 = matrix[row + 1][col + 1];
                int element6 = matrix[row + 1][col + 2];
                int element7 = matrix[row + 2][col];
                int element8 = matrix[row + 2][col + 1];
                int element9 = matrix[row + 2][col + 2];

                int sum = element1 + element2 + element3 + element4 + element5 + element6 + element7 + element8 + element9;

                if (sum > maxSum) {

                    elements.clear();

                    maxSum = sum;

                    elements.add(element1);
                    elements.add(element2);
                    elements.add(element3);
                    elements.add(element4);
                    elements.add(element5);
                    elements.add(element6);
                    elements.add(element7);
                    elements.add(element8);
                    elements.add(element9);
                }
            }
        }
        return elements;
    }

    private static int totalSumOfSubMatrix(int rows, int cols, int[][] matrix) {

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows - 2; row++) {

            for (int col = 0; col < cols - 2; col++) {

                int element1 = matrix[row][col];
                int element2 = matrix[row][col + 1];
                int element3 = matrix[row][col + 2];
                int element4 = matrix[row + 1][col];
                int element5 = matrix[row + 1][col + 1];
                int element6 = matrix[row + 1][col + 2];
                int element7 = matrix[row + 2][col];
                int element8 = matrix[row + 2][col + 1];
                int element9 = matrix[row + 2][col + 2];

                int sum = element1 + element2 + element3 + element4 + element5 + element6 + element7 + element8 + element9;

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    private static void printTheMatrix(List<Integer> elements) {
        for (int i = 0; i < elements.size(); i += 3) {
            System.out.print(elements.get(i) + " " + elements.get(i + 1) + " " + elements.get(i + 2));
            System.out.println();
        }
    }
}

