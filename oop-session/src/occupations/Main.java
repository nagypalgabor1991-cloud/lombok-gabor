package occupations;

public class Main {
    public static void main(String[] args) {
        Person gabor = new Person("Gábor", 42, Gender.MAN);
        gabor.introduce();
        gabor.printGoal();

        Chef gaborChef = new Chef("Gábor", 42, Gender.MAN);
        gaborChef.introduce();
        gaborChef.printGoal();
        gaborChef.cook("broccoli");

        Person attila = new Person();
        attila.setName("Attila");
        attila.setAge(22);
        attila.setGender(Gender.MAN);
        attila.introduce();
        attila.printGoal();

        Chef annaChef = new Chef();
        annaChef.setName("Anna");
        annaChef.setAge(69);
        annaChef.setGender(Gender.WOMAN);
        annaChef.introduce();
        annaChef.printGoal();
        annaChef.cook("pizza");
    }
}