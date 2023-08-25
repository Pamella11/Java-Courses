package WorkingWithAbstraction.Exercise.CardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankOfCard = scanner.nextLine();
        String suitOfCard = scanner.nextLine();

        int cardPower = getPower(RankPower.valueOf(rankOfCard), SuitPower.valueOf(suitOfCard));
        System.out.printf("Card name: %s of %s; Card power: %d", rankOfCard, suitOfCard, cardPower);
    }
    public static int getPower(RankPower rankPower, SuitPower suitPower){
        return rankPower.getPower() + suitPower.getPower();
    }
}
