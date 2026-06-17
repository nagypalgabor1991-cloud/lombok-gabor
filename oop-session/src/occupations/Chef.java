package occupations;

public class Chef extends Person {
    public Chef() {
        super();
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef.%n", getName(), getAge(), getGender());
    }

    public void cook(String food) {
        System.out.println(getName() + " has cooked some " + food + ".");
    }
}
