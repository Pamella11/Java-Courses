package ExamPreparation.Prelim;

import java.util.Scanner;

public class MovieDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int photosTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneTimer = Integer.parseInt(scanner.nextLine());

        double preparation = photosTime * 0.15;

        int timeForTakingPhotos = scenes * sceneTimer;

        double neededTime = preparation + timeForTakingPhotos;

        if (neededTime <= photosTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", photosTime - neededTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededTime - photosTime);
        }

    }
}
