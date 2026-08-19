package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {
    @Test
    void shouldReturnManipulatedString() {
        //given
        String example = "the quick brown fox JUMPS over the lazy dog";
        //when
        String result = StringManipulation.capitalizeLongWords(example);
        //then
        String expected = "the Quick Brown fox Jumps Over the Lazy dog";
        assertEquals(expected, result);
    }
}
