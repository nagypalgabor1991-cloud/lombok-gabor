import java.util.Scanner;

public class SmallTask3 {
    public static void main(String[] args) {
        System.out.println("Please enter six numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + ". number: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(getDifferenceBetweenSumOfEvensAndSumOfOdds(numbers));
    }

    public static int getDifferenceBetweenSumOfEvensAndSumOfOdds(int[] numbers) {
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEvens += numbers[i];
            } else {
                sumOfOdds += numbers[i];
            }
        }
        return sumOfEvens - sumOfOdds;
    }
}
