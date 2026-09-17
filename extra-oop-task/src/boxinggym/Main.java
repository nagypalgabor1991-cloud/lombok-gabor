package boxinggym;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Pista", 60, 7);
        Boxer firstBoxer = new Boxer("Paul", 24, 100, 10);
        Boxer secondBoxer = new Boxer("King", 26, 100, 12);
        Boxer thirdBoxer = new Boxer("Bryan", 32, 60, 18);
        Boxer fourthBoxer = new Boxer("Lee", 22, 110, 2);
        Boxer fifthBoxer = new Boxer("Edy", 25, 90, 9);
        List<Boxer> boxers = List.of(firstBoxer, secondBoxer, thirdBoxer, fourthBoxer, fifthBoxer);

        for (int i = 0; i < boxers.size() - 1; i++) {
            for (int j = i + 1; j < boxers.size(); j++) {
                boxers.get(i).fight(boxers.get(j));
                trainer.heal(boxers.get(i));
                trainer.heal(boxers.get(j));
            }
        }

        for (Boxer boxer : boxers) {
            System.out.println(boxer);
        }
        System.out.println("Boxer with highest wins:\n" + getBoxersWithHighestWins(boxers));

    }

    public static List<Boxer> getBoxersWithHighestWins(List<Boxer> boxers) {
        if(boxers == null || boxers.isEmpty()) {
            return new ArrayList<>();
        }

        int maxWins = -1;
        List<Boxer> boxersWithHighestWins = new ArrayList<>();

        for (Boxer boxer : boxers) {
            if (boxer.getWins() > maxWins) {
                maxWins = boxer.getWins();
                boxersWithHighestWins.clear();
                boxersWithHighestWins.add(boxer);
            } else if (boxer.getWins() == maxWins) {
                boxersWithHighestWins.add(boxer);
            }
        }
        return boxersWithHighestWins;
    }
}
