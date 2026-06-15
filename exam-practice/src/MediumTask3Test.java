import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediumTask3Test {
    @Test
    void shouldCalculateWeirdSum() {
        int[] test1 = {1,2,3,4};
        int[] test2 = {0,2,3,4};
        int[] test3 = {0,2,3,Integer.MAX_VALUE};
        Assertions.assertEquals(-6, MediumTask3.getWeirdSum(test1));
        Assertions.assertEquals(-7, MediumTask3.getWeirdSum(test2));
        Assertions.assertEquals(-4294967293L, MediumTask3.getWeirdSum(test3));
    }
}
