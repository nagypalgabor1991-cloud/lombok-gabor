package task4;

public non-sealed class Running extends OutdoorActivity {
    double distanceKm;

    public Running(double durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * 10 + distanceKm * 5;
    }

    public Running(double durationMinutes, double distanceKm) {
        super(durationMinutes);
        this.distanceKm = distanceKm;
    }
}
