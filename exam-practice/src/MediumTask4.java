public class MediumTask4 {
    public static void main(String[] args) {
       int[] example = {1,2,3,4};
        System.out.println(getWeirdSum(example));
    }
    public static long getWeirdSum(int[] numbers) {
        long sum = 0;
        for(int i=0; i < numbers.length; i++) {
            if(i%2!=0) {
                sum+= 2L *numbers[i];
            } else {
                sum-= numbers[i];
            }
        }
        return sum;
    }
}
