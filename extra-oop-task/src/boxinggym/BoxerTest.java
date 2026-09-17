package boxinggym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoxerTest {

    private Boxer strongBoxer;
    private Boxer weakBoxer;

    @BeforeEach
    void setUp() {
        strongBoxer = new Boxer("Strong Paul", 25, 100, 20);
        weakBoxer = new Boxer("Weak Lee", 22, 50, 5);
    }

    @Test
    void shouldFight() {
        //given, when
        strongBoxer.fight(weakBoxer);
        //then
        assertEquals(1, strongBoxer.getWins());
        assertEquals(0, weakBoxer.getWins());
        assertTrue(strongBoxer.getHitPoints() > 0);
        assertTrue(weakBoxer.getHitPoints() <= 0);
    }
}
