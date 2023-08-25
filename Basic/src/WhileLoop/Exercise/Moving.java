package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;

        int boxesSpace = 0;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            int boxes = Integer.parseInt(command);

            boxesSpace += boxes;

            if (boxesSpace > freeSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.", boxesSpace - freeSpace);
                break;

            }

            command = scanner.nextLine();

        }

        if (freeSpace >= boxesSpace) {
            System.out.printf("%d Cubic meters left.", freeSpace - boxesSpace);
        }


    }
}
