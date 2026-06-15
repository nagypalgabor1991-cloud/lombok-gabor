import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgorithmicComplexityInvestigationTest {
    @Test
    void shouldReturnTrueIfHasTwoSum() {
        int[] array = {13, 5, 7, 2};
        int number = 9;
        Assertions.assertTrue(AlgorithmicComplexityInvestigation.hasTwoSum(array, number));
        Assertions.assertTrue(AlgorithmicComplexityInvestigation.hasTwoSumOptimized(array, number));
    }

    @Test
    void shouldReturnTrueIfHasThreeSum() {
        int[] array = {13, 5, 7, 2};
        int number = 14;
        Assertions.assertTrue(AlgorithmicComplexityInvestigation.hasThreeSum(array, number));
        Assertions.assertTrue(AlgorithmicComplexityInvestigation.hasThreeSumOptimized(array, number));
    }

    @Test
    void shouldReturnTribonacciSequence() {
        int[] array = {0,0,1,1,2,4,7,13,24,44};
        int number = 10;
        Assertions.assertArrayEquals(array, AlgorithmicComplexityInvestigation.getTribonacciSequence(number));
    }

    @Test
    void shouldCalculateSumOfAllSubstrings() {
        String string = "123";
        Assertions.assertEquals(164,AlgorithmicComplexityInvestigation.sumOfAllSubstrings(string));
    }
}
