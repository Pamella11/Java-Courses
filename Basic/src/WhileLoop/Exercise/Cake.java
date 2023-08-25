package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int piecesSum = width * length;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {

            int pieces = Integer.parseInt(command);

            piecesSum -= pieces;

            if (piecesSum <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesSum));
                break;
            }

            command = scanner.nextLine();
        }

        if (piecesSum > 0) {
            System.out.printf("%d pieces are left.", piecesSum);
        }

    }
}
