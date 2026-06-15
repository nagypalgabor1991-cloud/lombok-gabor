import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallTask4Test {
    @Test
    void shouldReturnMaximumDifferenceBetweenAnyTwoNumbers() {
        int[] example1 = {3, -7, 1};
        int[] example2 = {6, 1, 4};
        int[] example3 = {-20, -5, -10};
        Assertions.assertEquals(10, SmallTask4.getMaxDifference(example1));
        Assertions.assertEquals(5, SmallTask4.getMaxDifference(example2));
        Assertions.assertEquals(15, SmallTask4.getMaxDifference(example3));
    }
}
