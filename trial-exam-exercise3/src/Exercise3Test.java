import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3Test {

    @Test
    void shouldCalculateTheMaximumSumOfAdjacentTriplets() {
        int[] test1 = {0};
        int[] test2 = {3,4,5,1,6,8,100};
        int[] test3 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        Assertions.assertEquals(0, Exercise3.maxSumOfTriplets(test1));
        Assertions.assertEquals(15, Exercise3.maxSumOfTriplets(test2));
        Assertions.assertEquals(4294967294L, Exercise3.maxSumOfTriplets(test3));
    }
}
