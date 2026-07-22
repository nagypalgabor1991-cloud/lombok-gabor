import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Car> availableCars = new ArrayList<>();

    void addCar(Car car) {
        if (car != null) {
            availableCars.add(car);
        }
    }

    void displayAvailableCars() {
        System.out.println("Available Cars: ");
        for (Car car : availableCars) {
            car.displayInfo();
        }
        System.out.println();
    }

    private boolean isValidPlateNumber(String plateNumber) {
        if (plateNumber == null || plateNumber.isBlank()) {
            return false;
        }
        String regex = "^[A-Z]{3}-\\d{3}$|^[A-Z]{2}-[A-Z]{2}-\\d{3}$";
        return plateNumber.toUpperCase().trim().matches(regex);
    }

    private String formatPlateNumber(String plateNumber) {
        return plateNumber.toUpperCase();
    }

    Car findCarByPlateNumber(String plateNumber) {
        if (!isValidPlateNumber(plateNumber)) {
            System.err.println("Invalid license plate.");
            return null;
        }
        String formattedPlate = formatPlateNumber(plateNumber);

        for (Car car : availableCars) {
            if (car.plateNumber.equalsIgnoreCase(formattedPlate)) {
                return car;
            }
        }
        return null;
    }

    void rentCar(Car car, int days) {
        if (car == null) {
            System.err.println("Car not found.");
            return;
        }
        double totalCost = car.calculateRentalCost(days);
        System.out.printf("Rented car: %n%-8s %-8s | %-8s | %.0f Ft%n",
                car.getBrand(), car.getModel(), car.plateNumber, totalCost);
    }

}
