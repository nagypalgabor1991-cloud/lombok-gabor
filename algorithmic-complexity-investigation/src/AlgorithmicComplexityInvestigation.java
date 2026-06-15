import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmicComplexityInvestigation {
    public static void main(String[] args) {
    }

    // O(N^2)
    public static boolean hasTwoSum(int[] array, int number) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(N)
    public static boolean hasTwoSumOptimized(int[] array, int number) {
        List<Integer> seenNumbers = new ArrayList<>();
        for (int currentNumber : array) {
            int difference = number - currentNumber;
            if (seenNumbers.contains(difference)) {
                return true;
            } else {
                seenNumbers.add(currentNumber);
            }
        }
        return false;
    }

    // O(N^3(
    public static boolean hasThreeSum(int[] array, int number) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // O(N^2)
    public static boolean hasThreeSumOptimized(int[] array, int number) {
        for (int i = 0; i < array.length - 2; i++) {
            int currentFirst = array[i];
            int difference = number - currentFirst;
            List<Integer> seenNumbers = new ArrayList<>();
            for (int j = i + 1; j < array.length; j++) {
                int currentSecond = array[j];
                int neededThird = difference - currentSecond;
                if (seenNumbers.contains(neededThird)) {
                    return true;
                }
                seenNumbers.add(currentSecond);
            }
        }
        return false;
    }

    public static int[] getFibonacciSequence(int number) {
        if (number <= 0) return new int[0];
        int[] result = new int[number];
        if (number > 0) {
            result[0] = 0;
        }
        if (number > 1) {
            result[1] = 1;
        }
        if (number > 2) {
            fillFibonacci(result, number - 1);
        }
        return result;
    }

    private static void fillFibonacci(int[] result, int index) {
        if (index < 2) {
            return;
        }
        fillFibonacci(result, index - 1);
        result[index] = result[index - 1] + result[index - 2];
    }
// O(N)
    public static int[] getTribonacciSequence(int number) {

        if (number <= 0) return new int[0];
        int[] result = new int[number];
        if (number > 0) {
            result[0] = 0;
        }
        if (number > 1) {
            result[1] = 0;
        }
        if (number > 2) {
            result[2] = 1;
        }
        if (number > 3) {
            fillTribonacci(result, number - 1);
        }
        return result;
    }

    private static void fillTribonacci(int[] result, int index) {
        if (index < 3) {
            return;
        }
        if (result[index - 1] == 0 && index - 1 >= 3) {
            fillTribonacci(result, index - 1);
        }
        if (result[index - 2] == 0 && index - 2 >= 3) {
            fillTribonacci(result, index - 2);
        }
        if (result[index - 3] == 0 && index - 3 >= 3) {
            fillTribonacci(result, index - 3);
        }
        result[index] = result[index - 1] + result[index - 2] + result[index - 3];
    }

    // O(N^2)
    public static long sumOfAllSubstrings(String input) {
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++)
                result += Long.parseLong(input.substring(i, j));
        }
        return result;
    }
}