package mythical;

public abstract class MythicalCreature {
    private String name;
    private CreatureType type;

    MythicalCreature() {
    }

    MythicalCreature(String name, CreatureType type) {
        this.name = name;
        this.type = type;
    }

    void introduce() {
        System.out.printf("Hello, I am a mythical creature and my name is %s.%n", name);
    }

    @Override
    public String toString() {
        return "MythicalCreature{name=" + name + ", type=" + type + "}";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    CreatureType getType() {
        return type;
    }

    void setType(CreatureType type) {
        this.type = type;
    }
}