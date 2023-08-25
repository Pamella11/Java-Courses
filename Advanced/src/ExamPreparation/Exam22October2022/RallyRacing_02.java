package ExamPreparation.Exam22October2022;

import java.util.Scanner;

public class RallyRacing_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        String[][] matrix = new String[size][size];

        fillTheMatrix(size, matrix, scanner);

        int carRow = 0;
        int carCol = 0;

        int passedKms = 0;
     
        String command = scanner.nextLine();
        
        boolean hasFinished = false;
        
        while (!command.equals("End")){

            switch (command) {
                case "up":
                    carRow -- ;
                    break;
                case "down":
                    carRow ++ ;
                    break;
                case "right":
                    carCol ++ ;
                    break;
                case "left":
                    carCol -- ;
                    break;
            }

            if (matrix[carRow][carCol].equals(".")){
                passedKms += 10;

            } else if (matrix[carRow][carCol].equals("T")) {
                matrix[carRow][carCol] = ".";
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col].equals("T")){
                            carRow = row;
                            carCol = col;
                            matrix[carRow][carCol] = ".";
                        }
                    }
                }
                passedKms += 30;

            } else if (matrix[carRow][carCol].equals("F")) {
                matrix[carRow][carCol] = "C";
                passedKms += 10;
                hasFinished = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (hasFinished){
            System.out.printf("Racing car %s finished the stage!%n", racingNumber);
        } else {
            matrix[carRow][carCol] = "C";
            System.out.printf("Racing car %s DNF.%n", racingNumber);
        }

        System.out.printf("Distance covered %d km.%n", passedKms);

        printMatrix(matrix, size);

    }

    private static void fillTheMatrix(int rows, String[][] matrix, Scanner scanner) {

        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(" ");
            matrix[row] = data;
        }
    }
    private static void printMatrix(String[][] matrix, int size){

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

}
