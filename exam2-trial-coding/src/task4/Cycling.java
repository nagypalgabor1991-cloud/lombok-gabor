package task4;

public non-sealed class Cycling extends OutdoorActivity {
    double averageSpeedKmH;

    public Cycling(double durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * averageSpeedKmH * 0.2;
    }

    public Cycling(double durationMinutes, double averageSpeedKmH) {
        super(durationMinutes);
        this.averageSpeedKmH = averageSpeedKmH;
    }
}
