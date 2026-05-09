import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4Test {
    @Test
    void shouldCalculatePeriodicSum() {
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {};
        Assertions.assertEquals(-3, Exercise4.calculatePeriodicSum(test1));
        Assertions.assertEquals(0, Exercise4.calculatePeriodicSum(test2));
    }
}
