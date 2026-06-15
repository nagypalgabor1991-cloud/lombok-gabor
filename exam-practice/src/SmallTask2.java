import java.util.Scanner;

public class SmallTask2 {
    public static void main(String[] args) {
        System.out.println("Please enter six numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + ". number: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(getSquareRootOfDifferenceBetweenLargestAndSmallest(numbers));
    }

    public static double getSquareRootOfDifferenceBetweenLargestAndSmallest(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        double difference = max - min;
        return (Math.sqrt(difference));
    }
}
