package task4;

public interface Activity {
    double caloriesBurned();
    double getDurationMinutes();
    default boolean isIntense() {
        return (caloriesBurned()/getDurationMinutes())*60 > 600;
    }
}
