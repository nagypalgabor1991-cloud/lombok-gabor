import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void shouldCalculateRentalCost() {
        Car car = new Car("ABC-123", 10000.0, Brand.BMW, "M3");
        double totalCost = car.calculateRentalCost(5);
        double edgeCaseCost = car.calculateRentalCost(0);
        assertEquals(50000.0, totalCost);
        assertEquals(0.0, edgeCaseCost);
    }

}
