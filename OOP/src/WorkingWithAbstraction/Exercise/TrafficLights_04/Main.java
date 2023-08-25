package WorkingWithAbstraction.Exercise.TrafficLights_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLight[] signals = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf)
                .toArray(TrafficLight[]::new);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            updateLights(signals);
            printLights(signals);
        }

    }

    public static void updateLights(TrafficLight[] trafficLight){
        for (int i = 0; i < trafficLight.length; i++) {
            switch (trafficLight[i]){
                //red -> green -> yellow -> red
                case RED:
                    trafficLight[i] = TrafficLight.GREEN;
                    break;
                case GREEN:
                    trafficLight[i] = TrafficLight.YELLOW;
                    break;
                case YELLOW:
                    trafficLight[i] = TrafficLight.RED;
                    break;
            }
        }


    }
    public static void printLights(TrafficLight[] trafficLight){
        for (TrafficLight light : trafficLight) {
            System.out.print(light + " ");
        }
        System.out.println();
    }
}
