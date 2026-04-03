import java.util.Arrays;

public class BasicAlgorithms {
    public static void main(String[] args) {
        int[] array = {3, 4, 13, 44, 56, 66, 77, 100, 96, 69, 5318008};
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println("Largest element of the array is: " + max);
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }
        }
        System.out.println("Smallest element of the array is: " + min);
        int greaterThan100 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                greaterThan100 += 1;
            }
        }
        System.out.println("Number of elements greater than 100: " + greaterThan100);
        int betweenMinus50And78 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= -50 && array[i] <= 78) {
                betweenMinus50And78 += 1;
            }
        }
        System.out.println("Number of elements between -50 and 78: " + betweenMinus50And78);
        int divisibleBy2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                divisibleBy2 += 1;
            }
        }
        System.out.println("Number of elements divisible by 2: " + divisibleBy2);
        int notDivisibleBy3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 != 0) {
                notDivisibleBy3 += 1;
            }
        }
        System.out.println("Number of elements not divisible by 3: " + notDivisibleBy3);
        int count73 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 73) {
                count73 += 1;
            }
        }
        System.out.println("73 appears " + count73 + " times.");
        boolean has100 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 100) {
                has100 = true;
                break;
            }
        }
        System.out.println("100 appears: " + has100);
        boolean hasElementOver100 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                hasElementOver100 = true;
                break;
            }
        }
        System.out.println("Number(s) greater than 100 can be found: " + hasElementOver100);
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Index of the first occurrence of 7: " + index);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the elements: " + sum);
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println("Sum of the elements: " + product);
        int result = 0;
        for (int i = 1; i < array.length + 1; i++) {
            result = (i % 4 == 0) ? result - array[i - 1] : result + array[i - 1];
            }
        System.out.println("Result of n1+n2+n3-n4+n5+n6+n7-n8... :" + result);
    }
}