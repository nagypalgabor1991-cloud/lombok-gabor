package task4;

import java.util.List;

public class FitnessTracker {
    public static void main(String[] args) {
        List<Activity> activities = List.of(
                new Running(60, 12.5),
                new Cycling(90, 50.1),
                new Hiking(200, 5.6)
        );
        for (Activity activity : activities) {
            String activityType = activity.getClass().getSimpleName();
            double caloriesBurned = activity.caloriesBurned();
            boolean isIntense = activity.isIntense();
            System.out.printf("Activity type: %s%n" +
                            "Calories burned: %.2f%n" +
                            "Is intense: %b%n%n",
                    activityType, caloriesBurned, isIntense);
        }
    }
}
