import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeLister {
    public static void main(String[] args) {
        System.out.println("Please enter an integer between 2 and 2 000 000 000: ");
        int userInput = getValidUserInput();
        List<Integer> primes = listPrimesUntil(userInput);
        System.out.println(primes);
    }

    public static List<Integer> listPrimesUntil(int userInput) {
        boolean[] array = new boolean[userInput + 1];
        Arrays.fill(array, true);
        if (userInput >= 0) {
            array[0] = false;
        }
        if (userInput >= 1) {
            array[1] = false;
        }
        if (userInput >= 2) {
            for (int i = 2; i <= Math.sqrt(userInput); i++) {
                if (array[i]) {
                    for (int j = i * i; j <= userInput; j += i)
                        array[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static int getValidUserInput() {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 5) {
            String userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                System.out.println("Input is empty.");
                attempts++;
            } else if (!isNumeric(userInput)) {
                System.out.println("Invalid number.");
                attempts++;
            } else {
                int number = Integer.parseInt(userInput);
                if (number >= 2 && number <= 2_000_000_000) {
                    return number;
                } else {
                    System.out.println("Number is out of range.");
                    attempts++;
                }
            }
        }
        if (attempts == 5) {
            System.out.println("Too many invalid inputs.");
            System.exit(0);
        }
        return -1;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}