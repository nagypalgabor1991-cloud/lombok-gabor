import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationTest {
    @Test
    @DisplayName("Should determine if it's prime")
    void shouldDetermineIfItsPrime() {
        Assertions.assertFalse(PrimeFactorization.isPrime(1));
        Assertions.assertFalse(PrimeFactorization.isPrime(9));
        Assertions.assertTrue(PrimeFactorization.isPrime(2));
        Assertions.assertTrue(PrimeFactorization.isPrime(73));
    }

    @Test
    @DisplayName("Should list all the primes up to the square root")
    void shouldListPrimesBelowSquareRoot() {
        List<Integer> expected = new ArrayList<>(List.of(2, 3));
        List<Integer> actual = PrimeFactorization.listPrimesBelowSquareRoot(14);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return prime factors")
    void shouldReturnPrimeFactors() {
        List<Integer> expected = new ArrayList<>(List.of(2, 7));
        List<Integer> actual = PrimeFactorization.returnPrimeFactors(14);
        Assertions.assertEquals(expected, actual);
    }
}
