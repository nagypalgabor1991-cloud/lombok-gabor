public class Exercise3 {
    public static void main(String[] args) {
    }

    public static long maxSumOfTriplets(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return (long) array[0] + array[1];
        }
        int scope = array.length - array.length % 3;
        long sum = Long.MIN_VALUE;
        for (int i = 0; i < scope; i += 3) {
            long temp = (long) array[i] + array[i + 1] + array[i + 2];
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }
}