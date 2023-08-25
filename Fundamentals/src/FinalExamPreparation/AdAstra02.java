package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([\\|#])(?<item>[A-Za-z ]+)\\1(?<expiration>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calorie>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int caloriePerDay = 2000;

        int totalCalories = 0;

        while (matcher.find()){
            int currentCalories = Integer.parseInt(matcher.group("calorie"));
            totalCalories += currentCalories;
        }

        int food = totalCalories / caloriePerDay;

        System.out.printf("You have food to last you for: %d days!%n", food);

        Matcher matcher1 = pattern.matcher(text);

        while (matcher1.find()){
            String item = matcher1.group("item");
            String expirationDate = matcher1.group("expiration");
            int calories = Integer.parseInt(matcher1.group("calorie"));
            //"Item: {item name}, Best before: {expiration date}, Nutrition: {calories}"
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", item, expirationDate, calories);
        }

    }
}
