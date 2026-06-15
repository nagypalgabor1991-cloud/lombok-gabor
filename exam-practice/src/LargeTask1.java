import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargeTask1 {
    public static void main(String[] args) {
        int input = getValidInput();
        boolean[] array = new boolean[input + 1];
        Arrays.fill(array, true);
        if (input >= 0) {
            array[0] = false;
        }
        if (input >= 1) {
            array[1] = false;
        }
        if (input >= 2) {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (array[i]) {
                    for (int j = i * i; j <= input; j += i) {
                        array[j] = false;
                    }
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                primes.add(i);
            }
        }
        int sum = 0;
        for (int i = 1; i < primes.size(); i += 2) {
            sum += primes.get(i);
        }
    }

    private static int getValidInput() {
        System.out.println("Please enter a number between 20 and 1 000 000: ");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true) {
            String input = sc.nextLine();
            if (isNumeric(input)) {
                number = Integer.parseInt(input);
                if (number >= 20 && number <= 1_000_000) {
                    break;
                }
            }
            System.out.println("Please enter a valid number: ");
        }
        return number;
    }

    public static boolean isNumeric(String str) {
        if ((str == null) || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
