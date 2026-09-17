package boxinggym;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void shouldReturnBoxersWithHighestWins() {
        //given
        Boxer b1 = new Boxer("A", 20, 100, 10);
        Boxer b2 = new Boxer("B", 20, 100, 10);
        Boxer b3 = new Boxer("C", 20, 100, 10);
        //when
        b1.fight(b2);
        b1.fight(b3);
        List<Boxer> winners = Main.getBoxersWithHighestWins(List.of(b1, b2, b3));
        //then
        assertEquals(2, winners.size());
        assertEquals("A", winners.get(0).getName());
        assertEquals("C", winners.get(1).getName());
    }
}
