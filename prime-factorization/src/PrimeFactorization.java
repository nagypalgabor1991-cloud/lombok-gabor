import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.println(returnPrimeFactors(1));
        System.out.println(returnPrimeFactors(2));
        System.out.println(returnPrimeFactors(14));
        System.out.println(returnPrimeFactors(73));
    }

    public static List<Integer> returnPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        if (number <= 1) return primeFactors;
        if (isPrime(number)) {
            primeFactors.add(number);
            return primeFactors;
        } else {
            int i = 0;
            int temp = number;
            List<Integer> possibleFactors = listPrimesBelowSquareRoot(number);
            for (int factor : possibleFactors) {
                while (temp % factor == 0) {
                    primeFactors.add(factor);
                    temp /= factor;
                }
            }
            if (temp > 1) {
                primeFactors.add(temp);
            }
            return primeFactors;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> listPrimesBelowSquareRoot(int number) {
        List<Integer> possibleFactors = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (isPrime(i)) {
                possibleFactors.add(i);
            }
        }
        return possibleFactors;
    }
}