public class Car extends Vehicle {
    private Brand brand;
    private String model;

    public Car(String plateNumber, double rentPrice, Brand brand, String model) {
        super(plateNumber, rentPrice);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void displayInfo() {
        System.out.printf("%-8s %-8s | %-8s | %.0f Ft%n",
                brand, model, plateNumber, rentPrice);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentPrice * days;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
