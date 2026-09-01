package task4;

public abstract class BaseActivity implements Activity {
    double durationMinutes;

    public abstract double caloriesBurned();

    @Override
    public double getDurationMinutes() {
        return durationMinutes;
    }

    public BaseActivity(double durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
