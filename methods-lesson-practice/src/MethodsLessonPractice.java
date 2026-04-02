import java.sql.SQLOutput;
import java.util.Arrays;

public class MethodsLessonPractice {
    //    Write a method that...

    //    1. Gets in a number and returns whether it is negative
    public static boolean isNegative(int number) {
        boolean result = number < 0;
        System.out.println(result ? "Yes, the number is negative." : "No, the number is not negative.");
        return result;
    }

    //    2. Gets in a number and returns whether it is even
    public static boolean isEven(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        }
        System.out.println(result ? "Yes, the number is even." : "No, the number is not even.");
        return result;
    }

    //    3. Gets in a number and returns whether it is divisible by 3
    public static boolean isDivisibleBy3(int number) {
        boolean result = false;
        if (number % 3 == 0) {
            result = true;
        }
        System.out.println(result ? "Yes, the number is divisible by 3." : "No, the number is not divisible by 3.");
        return result;
    }

    //    4. Gets in two numbers and returns the smaller one
    public static int getSmaller(int number1, int number2) {
        int smaller = (number1 < number2) ? number1 : number2;
        return smaller;
    }

    //    5. Gets in three numbers and returns the largest one
    public static int getLargest(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        }
        return number3;
    }

    //   6. Gets in a number and returns "Positive", "Negative", or "Zero"
    public static String getSign(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }

    //    7. Gets in two numbers and returns whether they are equal
    public static boolean isEqual(int number1, int number2) {
        return number1 == number2;
    }

    //    8. Gets in three numbers and returns whether all are equal
    public static boolean isEqual(int number1, int number2, int number3) {
        return number1 == number2 && number1 == number3;
    }

    //    9. Writes numbers from 1 to 50 to the console
    public static void print1to50() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }

    //    10. Writes numbers from 100 down to 1 to the console
    public static void print100to1() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    //    11. Writes all even numbers from 1 to 100 to the console
    public static void printEvens1to100() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    //    12. Writes all odd numbers from 1 to 100 to the console
    public static void printOdds1to100() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    //    13. Gets in a number and writes its multiplication table to the console
    public static void multiplicationTable(int number) {
        int[][] multiplicationTable = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    }

    //    14. Writes numbers divisible by both 3 and 5 from 1 to 100 to the console
    public static void printNumbersDivisibleBy3and5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    //    15. Gets in a number and returns the sum of numbers from 1 up to that number
    public static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    //    16. Gets in a number and returns its factorial
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //    17. Gets in a number and returns whether it is a perfect square
    public static boolean isPerfectSquare(int number) {
        for (int i = 0; i <= number; i++) {
            if (Math.sqrt(number) == i) {
                return true;
            }
        }
        return false;
    }

    //    18. Gets in a number and returns whether it is a palindrome
    public static boolean isPalindrome(int number) {
        String n = String.valueOf(number);
        int length = n.length();
        for (int i = 0; i < (length / 2); i++) {
            if (n.charAt(i) != n.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //    19. Gets in a number and returns the sum of its digits
    public static int sumOfDigits(int number) {
        int result = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            result += lastDigit;
            number /= 10;
        }
        return result;
    }

    //    20. Gets in a number and returns the product of its digits
    public static int productOfDigits(int number) {
        int result = 1;
        while (number != 0) {
            int lastDigit = number % 10;
            result *= lastDigit;
            number /= 10;
        }
        return result;
    }

    //    21. Gets in a number and returns the reversed number
    public static int reverseNumber(int number) {
        int result = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            result = (result * 10) + lastDigit;
            number /= 10;
        }
        return result;
    }

    //    22. Gets in a number and returns how many digits it has
    public static int numberOfDigits(int number) {
        String n = String.valueOf(number);
        return n.length();
    }

    //    23. Gets in a number and returns whether it is divisible by both 2 and 7
    public static boolean isDivisibleBy2And7(int number) {
        return number % 2 == 0 && number % 7 == 0;
    }

    //    24. Gets in a number and returns its absolute value without using built-in methods
    public static int absolute(int number) {
        int result = number;
        if (number < 0) {
            result = number * -1;
            return result;
        }
        return result;
    }

    //    25. Gets in an array and returns the sum of its elements
    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    //    26. Gets in an array and returns the average of its elements
    public static int average(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    //    27. Gets in an array and returns the maximum value
    public static int max(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    //    28. Gets in an array and returns the minimum value
    public static int min(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    //    29. Gets in an array and returns how many even numbers it contains
    public static int evenNumbers(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }

    //    30. Gets in an array and returns how many numbers are greater than 10
    public static int greaterThan10(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                result += 1;
            }
        }
        return result;
    }

    //    31. Gets in an array and returns a reversed version of it
    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    //    32. Gets in an array and a number and returns whether the array contains that number
    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    //    33. Gets in an array and a number and returns the index of that number (or -1 if not found)
    public static int index(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //    34. Gets in an array and a number and returns how many times that number appears
    public static int occurrence(int[] array, int number) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result += 1;
            }
        }
        return result;
    }

    //    35. Gets in an array and returns a new array containing only even numbers
    public static int[] filterEvenNumbers(int[] array) {
        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens += 1;
            }
        }
        int[] result = new int[evens];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j] = array[i];
                j += 1;
            }
        }
        return result;
    }

    //    36. Gets in an array and a number and returns a new array, in which all values are equal to that number
    public static int[] fillWith(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        return array;
    }

    //    37. Gets in an array and returns whether it is sorted in ascending order
    public static boolean isAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //    38. Gets in two arrays and returns a merged array containing all elements
    public static int[] merge(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < array1.length) {
                result[i] = array1[i];
            }
            if (i >= array1.length) {
                result[i] = array2[i - array1.length];
            }
        }
        return result;
    }

    //    39. Gets in an array and returns the second largest number
    public static int get2ndLargest(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[array.length - 2];
    }

    //    40. Gets in an array and returns a new array without duplicate values
    public static int[] removeDuplications(int[] array) {
        int duplications = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplications += 1;
                }
            }
        }
        int length = array.length - duplications;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 1 + j; k < array.length; k++) {
                    if (array[j] != array[k]) {
                        result[i] = array[j];
                    }
                }
            }
        }
        return result;
    }

    //    41. Gets in a string and returns the number of characters without using built-in length
    public static int length(String text) {
        int i = 0;
        text = text + "%";
        while (text.charAt(i) != '%') {
            i += 1;
        }
        return i;
    }

    //    42. Gets in a string and returns how many vowels it contains (English vowels only)
    public static int countVowels(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' ||
                    text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                result += 1;
            }
        }
        return result;
    }

    //    43. Gets in a string and returns the reversed string
    public static String reverse(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return new String(array);
    }

    //    44. Gets in a string and returns whether it is a palindrome
    public static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < (length / 2); i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //    45. Gets in a string and returns it in uppercase without using built-in methods
    // A-Z: 65-90
    // a-z: 97-122
    // 0-9: 48-57
    public static String convertToUppercase(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                array[i] = (char) (array[i] - 32);
            }
        }
        return new String(array);
    }

    //    46. Gets in a string and returns it with spaces replaced by underscores
    public static String convertSpaceToUnderscore(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (array[i] == ' ') {
                array[i] = '_';
            }
        }
        return new String(array);
    }

    //    47. Gets in a string and a character and returns how many times the character appears
    public static int countCharacter(String text, char character) {
        char[] array = text.toCharArray();
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (array[i] == character) {
                result += 1;
            }
        }
        return result;
    }

    //    48. Gets in a string and returns it with all digits removed
    // A-Z: 65-90
    // a-z: 97-122
    // 0-9: 48-57
    public static String removeDigits(String text) {
        char[] array = text.toCharArray();
        int digits = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                digits += 1;
            }
        }
        char[] result = new char[text.length() - digits];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) > 57) || (text.charAt(i) < 48)) {
                result[j] = text.charAt(i);
                j += 1;
            }
        }
        return new String(result);
    }

    //    49. Gets in an array of characters and returns whether any element appears more than once. You can presume that the array contains only English lowercase characters (a-z)
    public static boolean hasDuplicate(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //    50. Gets in a string and returns the whether the String only contains unique characters
    public static boolean isUnique(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        isNegative(-1);
//        isEven(1);
//        isDivisibleBy3(3);
//        System.out.println(getSmaller(3, 2));
//        System.out.println(getLargest(0, -2, -12));
//        System.out.println(getSign(1));
//        System.out.println(isEqual(3, -3));
//        System.out.println(isEqual(3, 2, 3));
//        print1to50();
//        print100to1();
//        printEvens1to100();
//        printOdds1to100();
//        multiplicationTable(5);
//        printNumbersDivisibleBy3and5();
//        System.out.println(sum(4));
//        System.out.println(factorial(4));
//        System.out.println(isPerfectSquare(16));
//        System.out.println(isPalindrome(10201));
//        System.out.println(sumOfDigits(121));
//        System.out.println(productOfDigits(122));
//        System.out.println(reverseNumber(123456));
//        System.out.println(numberOfDigits(12345));
//        System.out.println(isDivisibleBy2And7(28));
//        System.out.println(absolute(-11));
//        System.out.println(sum(new int[]{12,1,3}));
//        System.out.println(average(new int[]{1,2,3,4,5}));
//        System.out.println(max(new int[]{1,10,2,3,11}));
//        System.out.println(min(new int[]{1,10,2,3,11}));
//        System.out.println(evenNumbers(new int[]{1,10,2,3,12}));
//        System.out.println(greaterThan10(new int[]{1,10,2,3,12}));
//        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5, 6, 7})));
//        System.out.println(contains(new int[]{1,2,3,4}, 2));
//        System.out.println(index(new int[]{1,2,3,4,4,5},3));
//        System.out.println(occurrence(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 6, 0}, 6));
//        System.out.println(Arrays.toString(filterEvenNumbers(new int[]{0,1,2,3,4,5,6,7,8,9,10})));
//        System.out.println(Arrays.toString(fillWith(new int[]{1,2,3,4,5},6)));
//        System.out.println(isAscending(new int[]{1,2,3,4,3,6}));
//        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 4})));
//        System.out.println(get2ndLargest(new int[]{7, 4, 8, 23, 12}));
//        System.out.println(Arrays.toString(removeDuplications(new int[]{1, 1, 3, 4, 1, 3, 0, 0})));
//        System.out.println(length("four"));
//        System.out.println(countVowels("Must be a better solution"));
//        System.out.println(reverse("barbara"));
//        System.out.println(isPalindrome("apa"));
//        System.out.println(convertToUppercase("bigMAC"));
//        System.out.println(convertSpaceToUnderscore("2026 04 02"));
//        System.out.println(countCharacter("apa",'a'));
//        System.out.println(removeDigits("101dalmatians"));
//        System.out.println(hasDuplicate(new char[]{'a','b','c','a'}));
//        System.out.println(isUnique("unique"));
    }
}