import java.util.function.*;

public class LambdasBasicsPractice {
    public static void main(String[] args) {

        Supplier<Integer> returnFive = () -> 5;
        Supplier<String> returnHelloWorld = () -> "hello world";
        Supplier<String> returnMyName = () -> "Gabor Nagypal";
        Supplier<Person> returnNewPerson = () -> new Person();

        Consumer<Animal> printAnimal = animal -> System.out.println(animal);
        Consumer<Boolean> printBoolean = booleanValue -> System.out.println(booleanValue);
        Consumer<Double> printDouble = doubleValue -> System.out.println(doubleValue);
        Consumer<String> printString = stringValue -> System.out.println(stringValue);

        Predicate<Integer> isDivisibleBy20 = number -> number % 20 == 0;
        Predicate<Integer> isPerfectSquare = number -> {
            if (number < 0) return false;
            int sqrt = (int) Math.sqrt(number);
            return sqrt * sqrt == number;
        };
        Predicate<Integer> isPrime = number -> {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        };
        Predicate<Person> isAndreaOlderThan50 = person ->
                person.age > 50 && person.name.equals("Andrea");
        Predicate<String> isLengthBetween5And20 = string ->
                string.length() > 5 && string.length() < 20;

        Function<Animal, Integer> getLegs = animal -> animal.legs;
        Function<Animal, Integer> getDoubleAge = animal -> animal.age * 2;
        Function<Animal, String> getDescription = animal ->
                String.format("Name: %s, Age: %d, Legs: %d", animal.name, animal.age, animal.legs);
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        Function<TemperatureSensor, Double> getLastReading = sensor -> sensor.getLastReading();

        UnaryOperator<Integer> tripleNumber = number -> number * 3;
        UnaryOperator<Integer> squareNumber = number -> number * number;
        UnaryOperator<String> repeatFourTimes = string -> string.repeat(4);
        UnaryOperator<Animal> getOlderAnimal = animal -> new Animal(animal.name, animal.age + 1, animal.legs);
    }
}
