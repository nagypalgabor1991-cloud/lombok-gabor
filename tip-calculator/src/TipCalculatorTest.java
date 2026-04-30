import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {
    List<Integer> test = new ArrayList<>(List.of(2000, 250, 300, 50, 250));
    @Test
    @DisplayName("Should calculate tip")
    void shouldCalculateTip() {
        assertEquals(285, TipCalculator.calculateTip(test, 10));
        assertEquals(2280, TipCalculator.calculateTip(test, 80));
    }
    @ParameterizedTest
    @ValueSource(ints = {0, 81, -5, 100})
    @DisplayName("Should return: -1")
    void shouldReturnMinusOneForInvalidPercentages(int invalidPercentage) {
        assertEquals(-1, TipCalculator.calculateTip(test, invalidPercentage));
    }
}
