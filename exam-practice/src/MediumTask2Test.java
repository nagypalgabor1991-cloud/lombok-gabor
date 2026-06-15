import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediumTask2Test {
    @Test
    void should() {
        int[] example = {2, 4, 6};
        Assertions.assertEquals(16, MediumTask2.multiplyAllElementWithItsIndex(example));
    }
}
