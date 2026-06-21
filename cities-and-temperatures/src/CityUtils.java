import java.util.List;

public class CityUtils {

    City getHottestCity(List<City> cities) {
        City hottest = cities.get(0);
        for (City city : cities) {
            if (city.getTemperature() > hottest.getTemperature()) {
                hottest = city;
            }
        }
        return hottest;
    }

    City getColdestCity(List<City> cities) {
        City coldest = cities.get(0);
        for (City city : cities) {
            if (city.getTemperature() < coldest.getTemperature()) {
                coldest = city;
            }
        }
        return coldest;
    }

    double getAverageTemperature(List<City> cities) {
        double sum = 0;
        for (City city : cities) {
            sum += city.getTemperature();
        }
        return sum / cities.size();
    }

    City getCityClosestToAverageTemperature(List<City> cities) {
        double averageTemperature = getAverageTemperature(cities);
        double minDifference = Math.abs(cities.get(0).getTemperature() - averageTemperature);
        City cityWithMinDifference = cities.get(0);
        for(City city : cities){
            double actualDifference = Math.abs(city.getTemperature() - averageTemperature);
            if (actualDifference < minDifference){
                minDifference = actualDifference;
                cityWithMinDifference = city;
            }
        }
        return cityWithMinDifference;
    }
}
