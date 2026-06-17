package occupations;

public class Person {
    private int age;
    private String name;
    private Gender gender;

    public Person() {
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s.%n", name, age, gender);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
