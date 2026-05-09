import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise5Test {
    @Test
    void shouldDecideIfNumberIsValid() {
        Assertions.assertTrue(Exercise5.isValid(101));
        Assertions.assertTrue(Exercise5.isValid(9_999_999));
        Assertions.assertFalse(Exercise5.isValid(0));
    }
    @Test
    void shouldDecideIfNumberIsPrime() {
        Assertions.assertTrue(Exercise5.isPrime(1));
        Assertions.assertTrue(Exercise5.isPrime(71));
        Assertions.assertFalse(Exercise5.isPrime(4));
        Assertions.assertFalse(Exercise5.isPrime(15));
        Assertions.assertFalse(Exercise5.isPrime(9));
    }
    @Test
    void shouldListEverySecondPrimeUntilNumber() {
        List<Integer> excepted = new ArrayList<>(List.of(3,7,13,19));
        Assertions.assertEquals(excepted, Exercise5.getEverySecondPrimeUntilNumber(20));
    }
}
