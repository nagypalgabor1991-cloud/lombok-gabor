import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Please enter a number greater than 1:");
            userNumber = scanner.nextInt();
        } while (userNumber < 1);

        for (int i = 1; i <= userNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}