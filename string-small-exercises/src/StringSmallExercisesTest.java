import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSmallExercisesTest {
    @Test
    @DisplayName("Should count occurrence of the 'B' character")
    void shouldCountB() {
        assertEquals(2, StringSmallExercises.countOccurrenceOfB("bBffFDGddbB"));
        assertEquals(0, StringSmallExercises.countOccurrenceOfB("abc"));
    }
    @Test
    @DisplayName("Should count occurence of 'Hello'")
    void shouldCountHello() {
        assertEquals(0, StringSmallExercises.countOccurrenceOfHello(""));
        assertEquals(0, StringSmallExercises.countOccurrenceOfHello("lovely string"));
        assertEquals(4, StringSmallExercises.countOccurrenceOfHello("helloabcdhelloasvbhellogdvmhello"));
    }
}
