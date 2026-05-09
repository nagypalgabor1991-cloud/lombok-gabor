import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Please enter a number that is greater than 100 and smaller than 10 000 000: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (!isValid(input)) {
            System.out.println("Please enter a valid number: ");
            input = sc.nextInt();
        }
        sc.close();
        List<Integer> primes = getEverySecondPrimeUntilNumber(input);
        System.out.println(primes);
    }

    public static List<Integer> getEverySecondPrimeUntilNumber(int input) {
        List<Integer> primes = new ArrayList<>();
        int counter = 0;
        for (int i = 3; i < input; i += 2) {
            if (isPrime(i)) {
                counter++;
                if (counter % 2 != 0) {
                    primes.add(i);
                }
            }
        }
        return primes;
    }

    public static boolean isValid(int input) {
        return 100 < input && input < 10_000_000;
    }

    public static boolean isPrime(int input) {
        if (input <= 0) {
            return false;
        }
        int counter = 2;
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                counter++;
            }
        }
        return counter <= 2;
    }
}