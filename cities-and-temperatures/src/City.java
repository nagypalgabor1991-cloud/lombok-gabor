import java.util.Objects;

public class City {
    private String name;
    private double temperature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof City city)) return false;
        return Double.compare(temperature, city.temperature) == 0 && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, temperature);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }
}
