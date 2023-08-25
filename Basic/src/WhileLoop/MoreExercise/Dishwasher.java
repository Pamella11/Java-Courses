package WhileLoop.MoreExercise;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dishWasher = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int dishWasherSum = dishWasher * 750;

        int counter = 0;


        int plateCounter = 0;
        int potCounter = 0;


        while (!command.equals("End")) {

            int liquid = Integer.parseInt(command);

            counter++;


            if (counter % 3 == 0) {
                dishWasherSum -= liquid * 15;
                potCounter += liquid;
            } else {
                dishWasherSum -= liquid * 5;
                plateCounter += liquid;
            }

            if (dishWasherSum < 0) {
                break;
            }

            command = scanner.nextLine();
        }

        if (dishWasherSum >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plateCounter, potCounter);
            System.out.printf("Leftover detergent %d ml.", dishWasherSum);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(dishWasherSum));
        }

       }


    }

