package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String barcode = scanner.nextLine();

            String regex = "@#+(?<barcode>[A-Z][0-9A-Za-z]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()){

                String text = matcher.group("barcode");
                StringBuilder productGroup = new StringBuilder();

                for (char symbol:text.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        productGroup.append(symbol);
                    }
                }

                if (productGroup.length() > 0){
                    System.out.println("Product group: " + productGroup);
                } else {
                    System.out.println("Product group: 00");
                }

            } else {
                System.out.println("Invalid barcode");
            }


        }
    }
}
