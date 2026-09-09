import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HungarianPokerHandEvaluatorTest {
    @ParameterizedTest
    @MethodSource("provideHandsForEvaluation")
    void testEvaluate(List<Card> cards, HandType expectedType) {
        Hand hand = new Hand(cards);
        HandType actualType = HungarianPokerHandEvaluator.getInstance().evaluate(hand);
        assertEquals(expectedType, actualType);
    }

    private static List<Arguments> provideHandsForEvaluation() {
        return List.of(
                Arguments.of(
                        List.of(
                                new Card(Color.PIROS, Value.KIRALY),
                                new Card(Color.ZOLD, Value.KIRALY),
                                new Card(Color.TOK, Value.KIRALY),
                                new Card(Color.MAKK, Value.KIRALY),
                                new Card(Color.PIROS, Value.ASZ),
                                new Card(Color.ZOLD, Value.VII),
                                new Card(Color.TOK, Value.ALSO)
                        ),
                        HandType.POKER
                ),

                Arguments.of(
                        List.of(
                                new Card(Color.PIROS, Value.VII),
                                new Card(Color.PIROS, Value.VIII),
                                new Card(Color.PIROS, Value.IX),
                                new Card(Color.PIROS, Value.X),
                                new Card(Color.PIROS, Value.ALSO),
                                new Card(Color.PIROS, Value.FELSO),
                                new Card(Color.PIROS, Value.KIRALY)
                        ),
                        HandType.FLUSH
                ),

                Arguments.of(
                        List.of(
                                new Card(Color.MAKK, Value.VII),
                                new Card(Color.MAKK, Value.VIII),
                                new Card(Color.MAKK, Value.IX),
                                new Card(Color.MAKK, Value.X),
                                new Card(Color.PIROS, Value.ALSO),
                                new Card(Color.PIROS, Value.FELSO),
                                new Card(Color.PIROS, Value.KIRALY)
                        ),
                        HandType.ALMOST_FLUSH
                ),

                Arguments.of(
                        List.of(
                                new Card(Color.MAKK, Value.VII),
                                new Card(Color.MAKK, Value.VIII),
                                new Card(Color.MAKK, Value.IX),
                                new Card(Color.ZOLD, Value.X),
                                new Card(Color.PIROS, Value.ALSO),
                                new Card(Color.PIROS, Value.FELSO),
                                new Card(Color.PIROS, Value.KIRALY)
                        ),
                        HandType.NOTHING
                )

        );
    }
}
