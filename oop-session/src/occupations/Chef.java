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
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + ". I am a " + getGender() + " and a chef.");
    }

    public void cook(String food) {
        System.out.println(getName() + " has cooked some " + food + ".");
    }
}
