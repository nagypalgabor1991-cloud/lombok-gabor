import java.util.HashMap;
import java.util.Map;

public class HungarianPokerHandEvaluator {

    private static HungarianPokerHandEvaluator instance;

    private HungarianPokerHandEvaluator() {
    }

    public static HungarianPokerHandEvaluator getInstance() {
        if (instance == null) {
            instance = new HungarianPokerHandEvaluator();
        }
        return instance;
    }

    public HandType evaluate(Hand hand) {
        Map<Color, Integer> colorFrequency = new HashMap<>();
        Map<Value, Integer> valueFrequency = new HashMap<>();
        for (Card card : hand.getCards()) {
            Color color = card.getColor();
            Value value = card.getValue();
            if (colorFrequency.containsKey(color)) {
                colorFrequency.put(color, colorFrequency.get(color) + 1);
            } else {
                colorFrequency.put(color, 1);
            }
            if (valueFrequency.containsKey(value)) {
                valueFrequency.put(value, valueFrequency.get(value) + 1);
            } else {
                valueFrequency.put(value, 1);
            }
        }
        for(Map.Entry<Value, Integer> entrySet : valueFrequency.entrySet()) {
            if(entrySet.getValue()==4) {
                return HandType.POKER;
            }
        }
        for(Map.Entry<Color, Integer> entrySet : colorFrequency.entrySet()) {
            if(entrySet.getValue()==7) {
                return HandType.FLUSH;
            }
            if(entrySet.getValue()>= 4) {
                return HandType.ALMOST_FLUSH;
            }
        }
        return HandType.NOTHING;
    }
}
