package boxinggym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    private Boxer strongBoxer;
    private Trainer trainer;

    @BeforeEach
    void setUp() {
        strongBoxer = new Boxer("Strong Paul", 25, 100, 20);
        trainer = new Trainer("Johnnie Walker", 50, 10);
    }

    @Test
    void shouldTrain() {
        //given
        int initialPower = strongBoxer.getPower();
        //when
        trainer.train(strongBoxer);
        //then
        assertEquals(initialPower + 10, strongBoxer.getPower());
    }

    @Test
    void shouldHeal() {
        //given
        strongBoxer.setHitPoints(40);
        //when
        trainer.heal(strongBoxer);
        //then
        assertEquals(60, strongBoxer.getHitPoints());
    }
}
