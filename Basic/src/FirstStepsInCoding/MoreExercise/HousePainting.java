package FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double wallLength = Double.parseDouble(scanner.nextLine());
        double roofHeight = Double.parseDouble(scanner.nextLine());

        double sideWall = houseHeight * wallLength;
        double window = 1.5 * 1.5;
        double sideWallAndWindow = 2 * sideWall - 2 * window;
        double backWall = houseHeight * houseHeight;
        double entryDoor = 1.2 * 2;
        double backWallAndEntryDoor = 2 * backWall - entryDoor;
        double finalArea = sideWallAndWindow + backWallAndEntryDoor;
        double greenPaint = finalArea / 3.4;

        double roof = 2 * sideWall;
        double roof1 = 2 * (houseHeight * roofHeight / 2);
        double finalRoofArea = roof + roof1;
        double redPaint = finalRoofArea / 4.3;

        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);





        }
    }

