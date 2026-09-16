import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvParserTest {
    @Test
    void shouldParseCsv() {
        //given, when
        CsvParser csvParser = new CsvParser();
        List<City> result = csvParser.parseCsv("src/temperatures.csv", ";");
        //then
        assertEquals(8, result.size());
        assertEquals("Budapest", result.get(0).getName());
        assertEquals(22.0, result.get(0).getTemperature());
        assertEquals("New York", result.get(7).getName());
        assertEquals(40, result.get(7).getTemperature());
    }

    @Test
    void shouldParseInvalidCsv() {
        //given, when
        CsvParser csvParser = new CsvParser();
        List<City> result = csvParser.parseCsv("src/invalid_temperatures.csv", ";");
        //then
        assertEquals(2, result.size());
        assertEquals("Budapest", result.get(0).getName());
        assertEquals(22.0, result.get(0).getTemperature());
        assertEquals("Madrid", result.get(1).getName());
        assertEquals(25.0, result.get(1).getTemperature());
    }

}
