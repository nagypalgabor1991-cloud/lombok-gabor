public class Exercise2 {
    public static void main(String[] args) {

    }

    public static int addsAbsoluteValuesOfElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number < 0) {
                sum += -1 * number;
            } else {
                sum += number;
            }
        }
        return sum;
    }
}