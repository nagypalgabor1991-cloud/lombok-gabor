package task3;

import java.util.Set;

public class Deserialization {
    public static void main(String[] args) {
        CsvDeserializer deserializer = new CsvDeserializer();
        Set<Person> people = deserializer.read("C:\\Users\\nagyp\\Saját meghajtó\\Java\\04_Homework\\exam2-trial-coding\\src\\task3\\people.csv");
    for(Person person : people) {
        System.out.println(person);
    }
    }
}
