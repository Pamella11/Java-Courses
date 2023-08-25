package RegularExpressions.Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<customer>[A-Z][a-z]+)%[^\\,$%\\.]*<(?<product>\\w+)>[^\\,$%\\.]*\\|(?<quantity>\\d+)\\|[^\\,$%\\.]*?(?<price>\\d+\\.?\\d*)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count * price;
                totalSum += sum;
                //customerName}: {product} - {totalPrice}"
                System.out.printf("%s: %s - %.2f%n", customer, product, sum);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
