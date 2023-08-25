package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class FindTheRealQueen_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [][] matrix = new char[8][8];

        for (int row = 0; row < 8; row++) {
            String[] data = scanner.nextLine().split(" ");
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = data[col].charAt(0);
            }
        }

        boolean isQueen = true;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (matrix[row][col] == 'q'){
                    int matrixRow = row;
                    int matrixCol = col;
                    for (int i = matrixRow - 1; i >= 0 ; i--) {
                        for (int j = matrixCol - 1; j >= 0 ; j--) {
                           if (matrix[i][j] == 'q'){
                               isQueen = false;
                               break;
                           }
                           i--;
                        }
                    }
                    if (!isQueen){
                        break;
                    }
                    for (int i = matrixRow - 1; i >= 0 ; i--) {
                        for (int j = matrixCol + 1; j < matrixCol; j++) {
                            if (matrix[i][j] == 'q'){
                                isQueen = false;
                                break;
                            }
                            i--;
                        }
                    }
                    if (!isQueen){
                        break;
                    }
                }
            }
        }


    }
}
