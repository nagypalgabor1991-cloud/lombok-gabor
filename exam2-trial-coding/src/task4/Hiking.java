package task4;

public final class Hiking extends OutdoorActivity {
    double elevation;

    public Hiking(double durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * 7;
    }

    public Hiking(double durationMinutes, double elevation) {
        super(durationMinutes);
        this.elevation = elevation;
    }
}
