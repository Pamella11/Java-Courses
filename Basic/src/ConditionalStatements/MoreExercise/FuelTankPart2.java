package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();

        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double gasPrice = 0.93;

        double discount = 0;
        double finalSum = 0;


        switch (fuelType) {
            case "Gasoline":
                if (discountCard.equals("Yes")) {
                    discount = gasolinePrice - 0.18;
                    finalSum = fuel * discount;
                    if (fuel > 20 && fuel <=25){
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                } else if (discountCard.equals("No")) {
                    finalSum = fuel * gasolinePrice;
                    if (fuel > 20 && fuel <= 25) {
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                }
                break;
            case "Diesel":
                if (discountCard.equals("Yes")) {
                    discount = dieselPrice - 0.12;
                    finalSum = fuel * discount;
                    if (fuel > 20 && fuel <=25){
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                } else if (discountCard.equals("No")) {
                    finalSum = fuel * dieselPrice;
                    if (fuel > 20 && fuel <= 25) {
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                }
                break;
            case "Gas":
                if (discountCard.equals("Yes")) {
                    discount =gasPrice - 0.08;
                    finalSum = fuel * discount;
                    if (fuel > 20 && fuel <=25){
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                } else if (discountCard.equals("No")) {
                    finalSum = fuel * gasPrice;
                    if (fuel > 20 && fuel <= 25) {
                        finalSum = finalSum - finalSum * 0.08;

                    } else if (fuel > 25) {
                        finalSum = finalSum - finalSum * 0.1;
                    }
                }
                break;
                }
        System.out.printf("%.2f lv.",finalSum);

        }

    }


