import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

public class LambdasBasicsPracticeTest {
    @Test
    void testSuppliers() {
        Supplier<Integer> returnFive = () -> 5;
        Supplier<String> returnHelloWorld = () -> "hello world";
        Supplier<String> returnMyName = () -> "Gabor Nagypal";
        Supplier<Person> returnNewPerson = () -> new Person();

        assertEquals(5, returnFive.get());
        assertEquals("hello world", returnHelloWorld.get());
        assertEquals("Gabor Nagypal", returnMyName.get());
        assertNotNull(returnNewPerson.get());
    }

    @Test
    void testPredicates() {
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

        assertTrue(isDivisibleBy20.test(40));
        assertFalse(isDivisibleBy20.test(25));

        assertTrue(isPerfectSquare.test(16));
        assertFalse(isPerfectSquare.test(10));

        assertTrue(isPrime.test(7));
        assertFalse(isPrime.test(4));

        Person andrea = new Person();
        andrea.name = "Andrea";
        andrea.age = 52;

        Person youngAndrea = new Person();
        youngAndrea.name = "Andrea";
        youngAndrea.age = 30;

        assertTrue(isAndreaOlderThan50.test(andrea));
        assertFalse(isAndreaOlderThan50.test(youngAndrea));

        assertTrue(isLengthBetween5And20.test("Hello World"));
        assertFalse(isLengthBetween5And20.test("Java"));
    }


    @Test
    void testFunctions() {
        Animal cat = new Animal("Cirmi", 2, 4);
        TemperatureSensor sensor = new TemperatureSensor();

        Function<Animal, Integer> getLegs = animal -> animal.legs;
        Function<Animal, Integer> getDoubleAge = animal -> animal.age * 2;
        Function<Animal, String> getDescription = animal ->
                String.format("Name: %s, Age: %d, Legs: %d", animal.name, animal.age, animal.legs);
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        Function<TemperatureSensor, Double> getLastReading = sens -> sens.getLastReading();

        assertEquals(4, getLegs.apply(cat));
        assertEquals(4, getDoubleAge.apply(cat));
        assertEquals("Name: Cirmi, Age: 2, Legs: 4", getDescription.apply(cat));
        assertEquals(23.5, getLastReading.apply(sensor));
    }

    @Test
    void testUnaryOperators() {
        UnaryOperator<Integer> tripleNumber = number -> number * 3;
        UnaryOperator<Integer> squareNumber = number -> number * number;
        UnaryOperator<String> repeatFourTimes = string -> string.repeat(4);
        UnaryOperator<Animal> getOlderAnimal = animal -> new Animal(animal.name, animal.age + 1, animal.legs);

        assertEquals(15, tripleNumber.apply(5));
        assertEquals(25, squareNumber.apply(5));
        assertEquals("hellohellohellohello", repeatFourTimes.apply("hello"));

        Animal cat = new Animal("Cirmi", 2, 4);
        Animal olderCat = getOlderAnimal.apply(cat);
        assertEquals(3, olderCat.age);
        assertEquals("Cirmi", olderCat.name);
    }
}
