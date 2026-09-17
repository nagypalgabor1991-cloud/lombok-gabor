package boxinggym;

public class Boxer {
    private String name;
    private int age;
    private int hitPoints;
    private int power;
    private int wins;

    public Boxer(String name, int age, int hitPoints, int power) {
        this.name = name;
        this.age = age;
        this.hitPoints = hitPoints;
        this.power = power;
        this.wins = 0;
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return String.format(
                "+-----------------------+%n" +
                        "| Name: %-15s |%n" +
                        "| Age:  %-15d |%n" +
                        "| Wins: %-15d |%n" +
                        "+-----------------------+",
                this.name, this.age, this.wins
        );
    }

    private void hit(Boxer opponent) {
        opponent.hitPoints -= this.power;
        System.out.printf("%s hits %s with %d power. %s has %d hp left.%n",
                this.name, opponent.name, this.power, opponent.name, opponent.hitPoints);
    }

    private boolean isAlive() {
        return this.hitPoints > 0;
    }

    public void fight(Boxer opponent) {
        if (!this.isAlive() || !opponent.isAlive()) {
            System.out.printf("Fight cancelled: One or both boxers are dead (%s HP: %d, %s HP: %d).%n",
                    this.name, this.hitPoints, opponent.name, opponent.hitPoints);
            return;
        }
        while (this.isAlive() && opponent.isAlive()) {
            this.hit(opponent);
            if (opponent.isAlive()) {
                opponent.hit(this);
            }
        }
        if (this.isAlive()) {
            this.wins++;
            System.out.printf("The fight is over. Winner is %s. Loser is %s.%n", this.name, opponent.name);
        } else {
            opponent.wins++;
            System.out.printf("The fight is over. Winner is %s. Loser is %s.%n", opponent.name, this.name);
        }
    }
}
