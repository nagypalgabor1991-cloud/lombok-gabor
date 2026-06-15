import java.util.Objects;

public class ArrayFun {
    public static void main(String[] args) {
    }

    //        Write a method in which you…
    // 1D Arrays
//        1. Return the average of all even numbers in an array of integers.
    public static double getAverageOfEvenNumbers(int[] input) {
        int sum = 0;
        int count = 0;
        for (int number : input) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }
        return (double) sum / count;
    }

    //        2. Return a new array with each number squared only if the original number was odd.
//        If the original number was even, skip it from the new array.
    public static int[] getSquareListOfOdds(int[] input) {
        int countOdds = countOdds(input);
        int j = 0;
        int[] output = new int[countOdds];
        for (int number : input) {
            if (number % 2 != 0) {
                output[j++] = number * number;
            }
        }
        return output;
    }

    private static int countOdds(int[] input) {
        int countOdds = 0;
        for (int number : input) {
            if (number % 2 != 0) {
                countOdds++;
            }
        }
        return countOdds;
    }

    //        3. Return the number of strings that start with the letter "a" or "A".
    public static int countStringsStartingWithA(String[] input) {
        int count = 0;
        for (String string : input) {
            if (!string.isEmpty()) {
                if ((string.charAt(0) == 'a') || (string.charAt(0) == 'A')) {
                    count++;
                }
            }
        }
        return count;
    }

    //        4. Return the concatenation of all strings that are longer than 3 characters.
    public static String concatenateStrings(String[] input) {
        StringBuilder sb = new StringBuilder();
        for (String string : input) {
            if (string.length() > 3) {
                sb.append(string);
            }
        }
        return sb.toString();
    }

    //        5. Return true if the array of integers contains any consecutive duplicates.
    public static boolean hasConsecutiveDuplicates(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //2D Arrays
//    1. Return the total number of vowels in a 2D array of strings.
//    (you don’t have to consider non-English vowels, only a, e, i, o and u).
    public static int countVowels(String[][] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                String temp = input[i][j];
                for (int k = 0; k < temp.length(); k++) {
                    if ((temp.charAt(k) == 'a')
                            || (temp.charAt(k) == 'e')
                            || (temp.charAt(k) == 'i')
                            || (temp.charAt(k) == 'o')
                            || (temp.charAt(k) == 'u'))
                        count++;
                }
            }
        }
        return count;
    }

    //    2. Return the sum of the lengths of the longest string from each row (subarray).
    public static int sumOfLongestStringFromEachRow(String[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            int tempLength = 0;
            for (int j = 0; j < input[i].length; j++) {
                if (tempLength < input[i][j].length()) {
                    tempLength = input[i][j].length();
                }
            }
            sum += tempLength;
        }
        return sum;
    }

    //    3. Return a one-dimensional (in other words: flattened) array of all strings in uppercase.
    public static String[] returnOneDimensionalArrayOfAllStringsInUppercase(String[][] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            count += input[i].length;
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                result[index] = input[i][j].toUpperCase();
                index++;
            }
        }
        return result;
    }

    //    4. Return a new 2D array of booleans where each element is true if the corresponding string contains a digit.
    public static boolean[][] return2DArrayOfBooleans(String[][] input) {
        boolean[][] result = new boolean[input.length][];
        for (int i = 0; i < input.length; i++) {
            result[i] = new boolean[input[i].length];
            for (int j = 0; j < input[i].length; j++) {
                if (containsDigit(input[i][j])) {
                    result[i][j] = true;
                }
            }
        }
        return result;
    }

    public static boolean containsDigit(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //    5. Return the average number of characters per string across all elements.
    public static double getAverageCharacter(String[][] input) {
        if (input == null || input.length == 0) return 0.0;

        int totalCharacters = 0;
        int totalElements = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] != null) {
                    totalCharacters += input[i][j].length();
                    totalElements++;
                }
            }
        }

        if (totalElements == 0) return 0.0;

        return (double) totalCharacters / totalElements;
    }
}

