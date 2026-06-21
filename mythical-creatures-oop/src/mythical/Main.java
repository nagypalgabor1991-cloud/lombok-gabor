package mythical;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MythicalCreature> creatures = new ArrayList<>();

        creatures.add(new Dragon("Drogon", CreatureType.FIRE, 90));
        creatures.add(new Dragon("Rhaegal", CreatureType.FIRE, 75));
        creatures.add(new Dragon("Viserion", CreatureType.WATER, 60));
        creatures.add(new Fairy("Legolas", CreatureType.WATER, 10));
        creatures.add(new Fairy("Galadriel", CreatureType.WATER, 15));
        creatures.add(new Fairy("Elrond", CreatureType.WATER, 40));

        MythicalCreature john = new MythicalCreature("John", CreatureType.WATER) {};
        Dragon evilDragon = new Dragon("Evil dragon", CreatureType.FIRE, 25);
        Fairy lovelyFairy = new Fairy("Lovely fairy", CreatureType.WATER, 25);

        john.introduce();
        evilDragon.introduce();
        evilDragon.attack(john);
        lovelyFairy.introduce();
        lovelyFairy.heal(john);
        for (MythicalCreature creature : creatures) {
            System.out.println(creature);
        }
    }
}