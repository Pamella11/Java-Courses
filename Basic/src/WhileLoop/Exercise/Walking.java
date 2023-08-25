package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int stepsSum = 0;

        while (!command.equals("Going home")) {

            int currentSteps = Integer.parseInt(command);

            stepsSum += currentSteps;

            if (stepsSum >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", stepsSum - 10000);
                break;
            }
            command = scanner.nextLine();

        }

        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            stepsSum += stepsToHome;

            if (stepsSum >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", stepsSum - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.", 10000 - stepsSum);

            }

        }
    }
}
