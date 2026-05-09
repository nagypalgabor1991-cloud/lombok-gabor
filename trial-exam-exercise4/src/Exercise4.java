public class Exercise4 {
    public static void main(String[] args) {
    }

    public static long calculatePeriodicSum(int[] array) {
        long sum = 0;
        int sign = -1;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 != 0) {
                sum += (long) sign * array[i];
                sign *= -1;
            }
        }
        return sum;
    }
}