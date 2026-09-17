package boxinggym;

public class Trainer {
    private String name;
    private int age;
    private int experience;

    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void train(Boxer boxer) {
        boxer.setPower(boxer.getPower() + this.experience);
    }

    public void heal(Boxer boxer) {
        boxer.setHitPoints(boxer.getHitPoints() + 20);
        System.out.printf("%s healed %s. %s has %d hp now.%n", this.name, boxer.getName(), boxer.getName(), boxer.getHitPoints());
    }
}
