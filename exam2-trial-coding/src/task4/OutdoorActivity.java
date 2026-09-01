package task4;

public sealed abstract class OutdoorActivity extends BaseActivity permits Running, Cycling, Hiking {

    public OutdoorActivity(double durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public abstract double caloriesBurned();
}
