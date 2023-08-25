package ExamPreparation.Prelim;

import java.util.Scanner;

public class EasterEggs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCounter = Integer.parseInt(scanner.nextLine());


        int redEggCounter = 0;
        int orangeEggCounter = 0;
        int blueEggCounter = 0;
        int greenEggCounter = 0;

        int maxEggs = Integer.MIN_VALUE;

        String currentColour = "";

        for (int i = 1; i <= eggsCounter; i++) {

            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    redEggCounter++;
                    break;
                case "orange":
                    orangeEggCounter++;
                    break;
                case "blue":
                    blueEggCounter++;
                    break;
                case "green":
                    greenEggCounter++;
            }

            if (redEggCounter > maxEggs) {
                maxEggs = redEggCounter;
                currentColour = colour;
            } else if (orangeEggCounter > maxEggs) {
                maxEggs = orangeEggCounter;
                currentColour = colour;
            } else if (blueEggCounter > maxEggs) {
                maxEggs = blueEggCounter;
                currentColour = colour;
            } else if (greenEggCounter > maxEggs) {
                maxEggs = greenEggCounter;
                currentColour = colour;
            }


        }

        System.out.printf("Red eggs: %d%n", redEggCounter);
        System.out.printf("Orange eggs: %d%n", orangeEggCounter);
        System.out.printf("Blue eggs: %d%n", blueEggCounter);
        System.out.printf("Green eggs: %d%n", greenEggCounter);
        System.out.printf("Max eggs: %d -> %s", maxEggs, currentColour );
    }
}
