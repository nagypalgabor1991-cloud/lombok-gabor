import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvParser {
    public List<City> parseCsv(String filePath, String delimiter) {
        List<City> cities = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                String[] splitLine = line.split(delimiter);
                if (splitLine.length != 2) {
                    System.err.println("Invalid input" + Arrays.toString(splitLine));
                } else {
                    String name = splitLine[0];
                    double temperature = Double.parseDouble(splitLine[1]);
                    cities.add(new City(name, temperature));
                }
            }
        } catch (IOException e) {
            System.err.println("File not found!");
            throw new RuntimeException(e);
        }
        return cities;
    }
}
