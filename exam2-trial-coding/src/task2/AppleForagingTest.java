package task2;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleForagingTest {

    @Test
    void shouldReturnTopParticipant() {
        // given
        List<Pair> input = List.of(
                new Pair("Alice", 25),
                new Pair("Bob", 35),
                new Pair("Charlie", 50),
                new Pair("Alice", 32),
                new Pair("Diana", 48),
                new Pair("Eli", 20)
        );
        // when
        String result = AppleForaging.getTopParticipant(input);
        // then
        String expected = "Alice";
        assertEquals(expected, result);
    }
}