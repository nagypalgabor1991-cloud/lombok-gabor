import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Please, enter the price of the unit you have bought: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> prices = new ArrayList<>();
        while (sc.hasNextInt()) {
            int price = sc.nextInt();
            if (price == 0) {
                break;
            }
            prices.add(price);
            System.out.println("Please, enter the price of the next unit you have bought: (enter 0 if you are done)");
        }
        System.out.println("Please enter the tip percentage you'd like to add: ");
        int tip = sc.nextInt();
        sc.close();

        System.out.println(calculateTip(prices, tip));

    }
    public static double calculateTip(List<Integer> prices, int tip) {
        if (tip >= 10 && tip <= 80) {
            int spentMoney = 0;
            for (int i = 0; i < prices.size(); i++) {
                spentMoney += prices.get(i);
            }
            return spentMoney * (tip / 100.0);
        }
        return -1;
    }
}