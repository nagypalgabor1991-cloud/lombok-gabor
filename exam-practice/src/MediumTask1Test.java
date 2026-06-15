import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediumTask1Test {
    @Test
    void shouldReturnTrueIfAllValuesAreTrue() {
        boolean[][][][] example1 = {
                {
                        {{true, true}}
                },
                {
                        {{true, true}}
                },
                {
                        {{true, true}}
                },
                {
                        {{true, true}}
                }
        };
        boolean[][][][] example2 = {
                {
                        {{true, true}}
                },
                {
                        {{true, true}}
                },
                {
                        {{true, true}}
                },
                {
                        {{true, false}}
                }
        };
        Assertions.assertTrue(MediumTask1.areAllValuesTrue(example1));
        Assertions.assertFalse(MediumTask1.areAllValuesTrue(example2));
    }
}
