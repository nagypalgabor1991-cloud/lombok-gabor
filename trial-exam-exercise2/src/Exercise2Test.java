import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test {
    @Test
    void shouldCalculateSumOfAbsoluteValuesOfElements() {
        int[] test0 = {-10000000};
        int[] test1 = {-1, -1, 5, 0};
        int[] test2 = {3, 4, 5};
        Assertions.assertEquals(10000000, Exercise2.addsAbsoluteValuesOfElements(test0));
        Assertions.assertEquals(7, Exercise2.addsAbsoluteValuesOfElements(test1));
        Assertions.assertEquals(12, Exercise2.addsAbsoluteValuesOfElements(test2));

    }
}
