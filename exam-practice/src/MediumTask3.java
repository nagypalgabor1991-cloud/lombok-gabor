public class MediumTask3 {
    public static void main(String[] args) {
    }

    public static long getWeirdSum(int[] numbers) {
        long sum = 0;
        int counter = 1;
        for (int i = 0; i < numbers.length; i++) {
            switch (counter) {
                case 1 -> sum += numbers[i];
                case 2 -> sum += 2L * numbers[i];
                case 3 -> sum += -numbers[i];
                case 4 -> sum += -2L * numbers[i];
            }
            counter++;
            if (counter == 5) {
                counter = 1;
            }
        }
        return sum;
    }
}
