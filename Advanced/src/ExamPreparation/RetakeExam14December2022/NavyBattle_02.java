package ExamPreparation.RetakeExam14December2022;

import java.util.Arrays;
import java.util.Scanner;

public class NavyBattle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String [][] battlefield = new String[size][size];

        int submarineRow = -1;
        int submarineCol = -1;

        for (int row = 0; row < size; row++) {
            String [] data = scanner.nextLine().split("");
            for (int col = 0; col < size; col++) {
                battlefield[row][col] = data[col];
                if (battlefield[row][col].equals("S")){
                    submarineRow = row;
                    submarineCol = col;
                }
            }
        }

        int mineCounter = 0;
        int cruiserCounter = 0;

        boolean isOver = false;

        while (!isOver) {

            String command = scanner.nextLine();

            if (isValidCheck(command, size, submarineRow, submarineCol)) {
               // printMatrix(battlefield, size);
              //  System.out.println();

                battlefield[submarineRow][submarineCol] = "-";

                switch (command) {
                    case "up":
                    submarineRow--;
                        break;
                    case "down":
                    submarineRow++;
                        break;
                    case "right":
                    submarineCol++;
                        break;
                    case "left":
                    submarineCol--;
                        break;
                }

                if (battlefield[submarineRow][submarineCol].equals("*")){
                    mineCounter++;
                    battlefield[submarineRow][submarineCol] = "S";
                } else if (battlefield[submarineRow][submarineCol].equals("C")) {
                    cruiserCounter++;
                    battlefield[submarineRow][submarineCol] = "S";
                } else {
                    battlefield[submarineRow][submarineCol] = "S";
                }

                if (mineCounter == 3){
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
                    battlefield[submarineRow][submarineCol] = "S";
                    isOver = true;
                    break;
                }

                if (cruiserCounter == 3){
                    battlefield[submarineRow][submarineCol] = "S";
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    isOver = true;
                    break;
                }

            }
        }
        printMatrix(battlefield, size);
    }

    private static boolean isValidCheck(String command, int size, int playerRow, int playerCol) {
        switch (command){
            case "up":
                if (playerRow - 1 >= 0){
                    return true;
                }
                break;
            case "down":
                if (playerRow + 1 < size){
                    return true;
                }
                break;
            case "right":
                if (playerCol + 1 < size){
                    return true;
                }
                break;
            case "left":
                if (playerCol - 1 >= 0){
                    return true;
                }
                break;
        }
        return false;
    }

    private static void printMatrix(String[][] matrix, int size){

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

}
