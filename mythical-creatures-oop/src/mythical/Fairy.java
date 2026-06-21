package mythical;

public class Fairy extends MythicalCreature {
    private int healingPower;

    public Fairy() {
        super();
    }

    public Fairy(String name, CreatureType type, int healingPower) {
        super(name, type);
        this.healingPower = healingPower;
    }

    @Override
    public void introduce() {
        System.out.printf("Hello, I am a FAIRY and my name is %s.%n", this.getName());
    }

    public void heal(MythicalCreature c) {
        System.out.printf("%s has healed %s with %d hit points!%n", this.getName(), c.getName(), healingPower);
    }

    @Override
    public String toString() {
        return "Fairy{name=" + this.getName() + ", type=" + this.getType() + ", healingPower=" + healingPower + "}";
    }
}