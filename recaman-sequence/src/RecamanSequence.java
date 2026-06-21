import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecamanSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRecamanSequenceLoop(10)));
        System.out.println(Arrays.toString(getRecamanSequence(10)));
    }

    public static int[] getRecamanSequence(int input) {
        int[] recamanSequence = new int[input + 1];
        List<Integer> visited = new ArrayList<>();
        recamanSequence[0] = 0;
        visited.add(0);
        getRecamanSequence(1, input, recamanSequence, visited);
        return recamanSequence;
    }

    private static void getRecamanSequence(int index, int max, int[] recamanSequence, List<Integer> visited) {
        if (index > max) {
            return;
        }
        int previous = recamanSequence[index - 1];
        int temp = previous - index;
        if(temp > 0 && !visited.contains(temp)) {
            recamanSequence[index] = temp;
            visited.add(temp);
        } else {
            temp = previous + index;
            recamanSequence[index] = temp;
            visited.add(temp);
        }
        getRecamanSequence(index + 1, max, recamanSequence, visited);
    }


    public static int[] getRecamanSequenceLoop(int input) {
        int[] recamanSequence = new int[input + 1];
        List<Integer> visited = new ArrayList<>();
        recamanSequence[0] = 0;
        visited.add(0);
        for (int i = 1; i <= input; i++) {
            int previous = recamanSequence[i - 1];
            int temp = previous - i;
            if (temp > 0 && !visited.contains(temp)) {
                recamanSequence[i] = temp;
                visited.add(temp);
            } else {
                temp = previous + i;
                recamanSequence[i] = temp;
                visited.add(temp);
            }
        }
        return recamanSequence;
    }

}