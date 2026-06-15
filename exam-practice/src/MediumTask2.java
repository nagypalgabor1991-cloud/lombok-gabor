public class MediumTask2 {
    public static void main(String[] args) {

    }

    public static long multiplyAllElementWithItsIndex(int[] numbers) {
        if (numbers.length < 1) {
            return 0;
        }
        int sum = numbers[1];
        for (int i = 2; i < numbers.length; i++) {
            sum += numbers[i]*i;
        }
        return sum;
    }
}
