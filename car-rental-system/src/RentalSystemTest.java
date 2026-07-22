import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalSystemTest {

    @Test
    void shouldFindCar() {
        RentalSystem testRentalSystem = new RentalSystem();
        Car car = new Car("MCB-222", 15000, Brand.MERCEDES, "SLS AMG");
        testRentalSystem.addCar(car);
        Car found = testRentalSystem.findCarByPlateNumber("MCB-222");
        assertNotNull(found);
        assertEquals("MCB-222", found.plateNumber);
    }

    @Test
    void shouldNotFindCarIfPlateInvalid() {
        RentalSystem testRentalSystem = new RentalSystem();
        Car car = new Car("MCB-222", 15000, Brand.MERCEDES, "SLS AMG");
        testRentalSystem.addCar(car);
        Car found = testRentalSystem.findCarByPlateNumber("invalid-plate-123");
        assertNull(found);
    }

    @Test
    void shouldNotFindCarIfNotExist() {
        RentalSystem testRentalSystem = new RentalSystem();
        Car car = new Car("MCB-222", 15000, Brand.MERCEDES, "SLS AMG");
        testRentalSystem.addCar(car);
        Car found = testRentalSystem.findCarByPlateNumber("XYZ-999");
        assertNull(found);
    }
}
