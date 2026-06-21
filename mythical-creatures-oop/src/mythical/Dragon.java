package mythical;

public class Dragon extends MythicalCreature {
    private int power;

    public Dragon() {
        super();
    }

    public Dragon(String name, CreatureType type, int power) {
        super(name, type);
        this.power = power;
    }

    @Override
    public void introduce() {
        System.out.printf("Hello, I am a DRAGON and my name is %s.%n", getName());
    }

    public void attack(MythicalCreature c) {
        System.out.printf("%s has attacked %s with %d power!%n", this.getName(), c.getName(), power);
    }

    @Override
    public String toString() {
        return "Dragon{name=" + this.getName() + ", type=" + this.getType() + ", power=" + power + "}";
    }
}
