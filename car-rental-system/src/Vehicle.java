public abstract class Vehicle {
    protected String plateNumber;
    protected double rentPrice;

    public Vehicle(String plateNumber, double rentPrice) {
        this.plateNumber = plateNumber;
        this.rentPrice = rentPrice;
    }

    abstract void displayInfo();

    abstract double calculateRentalCost(int days);
}
