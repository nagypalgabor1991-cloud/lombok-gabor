import java.util.Scanner;

public class SmallTask1 {
    public static void main(String[] args) {
        System.out.println("Please enter five numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + ". number: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        isPerfectSquareAndEven(numbers);
    }

    public static void isPerfectSquareAndEven(int[] numbers) {
        for (int number : numbers) {
            if (Math.sqrt(number) % 2 == 0 && number % 2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}