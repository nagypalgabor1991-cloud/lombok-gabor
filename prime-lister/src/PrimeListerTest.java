import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrimeListerTest {
    @Test
    void shouldReturnTrueOnlyIfItsNumber() {
        Assertions.assertTrue(PrimeLister.isNumeric("1"));
        Assertions.assertTrue(PrimeLister.isNumeric("2000000000"));
        Assertions.assertFalse(PrimeLister.isNumeric(""));
        Assertions.assertFalse(PrimeLister.isNumeric("a"));
        Assertions.assertFalse(PrimeLister.isNumeric("?"));
    }
    @Test
    void shouldListPrimesUntilNumber() {
        List<Integer> expected = List.of(2,3,5,7,11,13,17,19,23);
        Assertions.assertEquals(expected, PrimeLister.listPrimesUntil(25));
    }
}

