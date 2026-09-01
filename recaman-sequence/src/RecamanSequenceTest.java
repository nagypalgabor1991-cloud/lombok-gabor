import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RecamanSequenceTest {
    @Test
    void shouldReturnRecamanSequenceRecursive() {
        //given, when
        int[] result = RecamanSequence.getRecamanSequence(10);
        //then
        int[] expected = {0, 1, 3, 6, 2, 7, 13, 20, 12, 21, 11};
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnRecamanSequenceLoop() {
        //given, when
        int[] result = RecamanSequence.getRecamanSequenceLoop(10);
        //then
        int[] expected = {0, 1, 3, 6, 2, 7, 13, 20, 12, 21, 11};
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnZero() {
        //given, when
        int[] recursiveResult = RecamanSequence.getRecamanSequence(0);
        int[] loopResult = RecamanSequence.getRecamanSequenceLoop(0);
        //then
        int[] expected = {0};
        assertArrayEquals(expected, recursiveResult);
        assertArrayEquals(expected, loopResult);
    }
}
