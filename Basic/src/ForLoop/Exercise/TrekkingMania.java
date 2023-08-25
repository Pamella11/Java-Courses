package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hikersGroupCount = Integer.parseInt(scanner.nextLine());

        double group1Sum = 0;
        double group2Sum = 0;
        double group3Sum = 0;
        double group4Sum = 0;
        double group5Sum = 0;

        for (int i = 1; i <= hikersGroupCount ; i++) {

            int hikersInGroup = Integer.parseInt(scanner.nextLine());

            if (hikersInGroup <= 5) {
                group1Sum += hikersInGroup;
            } else if (hikersInGroup <= 12) {
                group2Sum += hikersInGroup;
            } else if (hikersInGroup <= 25) {
                group3Sum += hikersInGroup;
            } else if (hikersInGroup <= 40) {
                group4Sum += hikersInGroup;
            } else  {
                group5Sum += hikersInGroup;
            }
        }
        double allGroupsSum = group1Sum + group2Sum + group3Sum + group4Sum + group5Sum;

        double group1percent = (group1Sum / allGroupsSum) * 100;
        double group2percent = (group2Sum / allGroupsSum) * 100;
        double group3percent = (group3Sum / allGroupsSum) * 100;
        double group4percent = (group4Sum / allGroupsSum) * 100;
        double group5percent = (group5Sum / allGroupsSum) * 100;

        System.out.printf("%.2f%%%n",group1percent);
        System.out.printf("%.2f%%%n",group2percent);
        System.out.printf("%.2f%%%n",group3percent);
        System.out.printf("%.2f%%%n",group4percent);
        System.out.printf("%.2f%%",group5percent);
    }
}
