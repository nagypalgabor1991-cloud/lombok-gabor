import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1Test {
    @Test
    void shouldReturnTrueIfItHasMaximum3Divisors() {
        Assertions.assertTrue(Exercise1.hasMax3Divisors(1));
        Assertions.assertFalse(Exercise1.hasMax3Divisors(6));
    }
}
