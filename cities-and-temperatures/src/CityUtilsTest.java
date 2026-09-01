import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityUtilsTest {

    @Test
    void shouldReturnHottestCity() {
        //given
        CityUtils cityUtils = new CityUtils();
        List<City> sampleCities = List.of(
                new City("London", 20.0),
                new City("Rome", 30.0),
                new City("Munchen", -50.0),
                new City("Budapest", 22.0)
        );
        //when
        City hottest = cityUtils.getHottestCity(sampleCities);
        //then
        assertEquals("Rome", hottest.getName());
        assertEquals(30.0, hottest.getTemperature());
    }

    @Test
    void shouldReturnColdestCity() {
        //given
        CityUtils cityUtils = new CityUtils();
        List<City> sampleCities = List.of(
                new City("London", 20.0),
                new City("Rome", 30.0),
                new City("Munchen", -50.0),
                new City("Budapest", 22.0)
        );
        //when
        City coldest = cityUtils.getColdestCity(sampleCities);
        //then
        assertEquals("Munchen", coldest.getName());
        assertEquals(-50.0, coldest.getTemperature());
    }

    @Test
    void shouldReturnAvarageTemperature() {
        //given
        CityUtils cityUtils = new CityUtils();
        List<City> sampleCities = List.of(
                new City("London", 20.0),
                new City("Rome", 30.0),
                new City("Munchen", -50.0),
                new City("Budapest", 22.0)
        );
        //when
        double average = cityUtils.getAverageTemperature(sampleCities);
        //then
        assertEquals(5.5, average, 0.0001);
    }

    @Test
    void shouldReturnCityClosestToAverageTemperature() {
        //given
        CityUtils cityUtils = new CityUtils();
        List<City> sampleCities = List.of(
                new City("London", 20.0),
                new City("Rome", 30.0),
                new City("Munchen", -50.0),
                new City("Budapest", 22.0)
        );
        //when
        City closest = cityUtils.getCityClosestToAverageTemperature(sampleCities);
        //then
        assertEquals("London", closest.getName());
    }

    @Test
    void shouldReturnFirstHottestCity() {
        //given
        CityUtils cityUtils = new CityUtils();
        List<City> sampleCities = List.of(
                new City("London", 22.0),
                new City("Rome", 30.0),
                new City("Budapest", 30.0)
        );
        //when
        City hottest = cityUtils.getHottestCity(sampleCities);
        //then
        assertEquals("Rome", hottest.getName());
    }
}
