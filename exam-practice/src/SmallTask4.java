public class SmallTask4 {
    public static void main(String[] args) {
    }

    public static int getMaxDifference(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        if ((min < 0 && max < 0) || (min >= 0 && max >= 0)) {
            return Math.abs(max - min);
        } else {
            return Math.abs(min) + max;
        }
    }
}
