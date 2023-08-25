package WorkingWithAbstraction.Exercise.JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];

        fillTheMatrix(row, col, matrix);

        String command = scanner.nextLine();

        long sum = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] peterCoordinates = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] evilPowerCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int peterRow = peterCoordinates[0];
            int peterCol = peterCoordinates[1];

            int evilPowerRow = evilPowerCoordinates[0];
            int evilPowerCol = evilPowerCoordinates[1];

            evilPowerMoves(matrix, evilPowerRow, evilPowerCol);

            sum = peterMoves(matrix, sum, peterRow, peterCol);

            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static long peterMoves(int[][] matrix, long sum, int peterRow, int peterCol) {
        while (peterRow >= 0 && peterCol < matrix[1].length) {
            if (peterRow < matrix.length && peterCol >= 0 && peterCol < matrix[0].length) {
                sum += matrix[peterRow][peterCol];
            }
            peterCol++;
            peterRow--;
        }
        return sum;
    }

    private static void evilPowerMoves(int[][] matrix, int evilPowerRow, int evilPowerCol) {
        while (evilPowerRow >= 0 && evilPowerCol >= 0){
            if (evilPowerRow < matrix.length && evilPowerCol < matrix[0].length) {
                matrix[evilPowerRow][evilPowerCol] = 0;
            }
            evilPowerRow--;
            evilPowerCol--;
        }
    }

    private static void fillTheMatrix(int x, int y, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
    }

}
