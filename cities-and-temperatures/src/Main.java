import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
     CsvParser csvParser = new CsvParser();
        List<City> cities = csvParser.parseCsv("D://Google_Drive//Java//04_Homework//cities-and-temperatures//src//temperatures.csv", ";");
        System.out.println(cities );
        CityUtils cityUtils = new CityUtils();
        System.out.println("Hottest: " + cityUtils.getHottestCity(cities));
        System.out.println("Coldest: " + cityUtils.getColdestCity(cities));
        System.out.println("Average: " + cityUtils.getAverageTemperature(cities));
        System.out.println("City closest to average: " + cityUtils.getCityClosestToAverageTemperature(cities));
    }
}