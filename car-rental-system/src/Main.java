public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car trabant = new Car("TRA-111", 5000, Brand.TRABANT, "601");
        Car mercedes = new Car("MCB-222", 150000, Brand.MERCEDES, "G-Class");
        Car bmw = new Car("BMW-333", 100000, Brand.MERCEDES, "M4");

        rentalSystem.addCar(trabant);
        rentalSystem.addCar(mercedes);
        rentalSystem.addCar(bmw);

        rentalSystem.displayAvailableCars();

        Car foundCar = rentalSystem.findCarByPlateNumber("MCB-222");
        rentalSystem.rentCar(foundCar, 7);
    }
}
