import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFunTest {
    @Test
    void shouldCalculateAverageOfEvenNumbers() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(4, ArrayFun.getAverageOfEvenNumbers(test));
    }

    @Test
    void shouldReturnSquareListOfOdds() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 9, 25, 49, 81};
        Assertions.assertArrayEquals(expected, ArrayFun.getSquareListOfOdds(test));
    }

    @Test
    void shouldCalculateStringsStartingWithA() {
        String[] test = {"", "apple", "pear", "Orange", "Avocado", "Ananas"};
        Assertions.assertEquals(3, ArrayFun.countStringsStartingWithA(test));
    }

    @Test
    void shouldConcatenateStringsLongerThan3Characters() {
        String[] test = {"", "one", "two", "three", "four", "five", "six", "seven"};
        String expected = "threefourfiveseven";
        Assertions.assertEquals(expected, ArrayFun.concatenateStrings(test));
    }

    @Test
    void shouldReturnTrueIfThereIsConsecutiveDuplicate() {
        int[] testTrue = {0, 1, 2, 3, 4, 5, 5};
        int[] testFalse = {0, 1, 2, 3, 4, 5};
        Assertions.assertTrue(ArrayFun.hasConsecutiveDuplicates(testTrue));
        Assertions.assertFalse(ArrayFun.hasConsecutiveDuplicates(testFalse));
    }

    @Test
    void shouldCountVowels() {
        String[][] test = {
                {"Hello", "darkness", "my"},
                {"old", "friend"}
        };
        Assertions.assertEquals(7, ArrayFun.countVowels(test));
    }

    @Test
    void shouldCalculateSumOfLongestStringFromEachRow() {
        String[][] test = {
                {"one", "two", "three"},
                {"red", "green", "blue"},
                {"audi", "bmw", "mercedes"}
        };
        Assertions.assertEquals(18, ArrayFun.sumOfLongestStringFromEachRow(test));
    }

    @Test
    void shouldReturn1DArrayOfAllStringInUppercase() {
        String[][] test = {
                {"cat", "dog"},
                {"ape"},
                {"fish", "horse", "DONKEY"}
        };
        String[] expected = {"CAT", "DOG", "APE", "FISH", "HORSE", "DONKEY"};
        Assertions.assertArrayEquals(expected, ArrayFun.returnOneDimensionalArrayOfAllStringsInUppercase(test));
    }

    @Test
    void shouldReturn2DArrayOfBooleans() {
        String[][] test = {
                {"c4t", "dog"},
                {"ape"},
                {"f1sh", "h0rse", "DONKEY"}
        };
        boolean[][] expected = {
                {true, false},
                {false},
                {true, true, false}
        };
        Assertions.assertArrayEquals(expected, ArrayFun.return2DArrayOfBooleans(test));
    }

    @Test
    void shouldCalculateAverageCharacter() {
        String[][] test = {
                {"c4t", "dog"},
                {"ape"},
                {"f1sh", "h0rse", "DONKEY"}
        };
        double expected = 4.0;
        Assertions.assertEquals(expected, ArrayFun.getAverageCharacter(test));
    }
}
