package task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppleForaging {
    public static String getTopParticipant(List<Pair> pairs) {
        if (pairs == null || pairs.isEmpty()) {
            return null;
        }
        HashMap<String, Integer> collectedApples = new HashMap<>();
        for (Pair pair : pairs) {
            String name = pair.getName();
            int apples = pair.getCollectedApples();
            if (collectedApples.containsKey(name)) {
                collectedApples.put(name, collectedApples.get(name) + apples);
            } else {
                collectedApples.put(name, apples);
            }
        }
        int mostApples = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : collectedApples.entrySet()) {
            if (entry.getValue() > mostApples) {
                mostApples = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }
}
