package calculator.operations.conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    Temperature temp = new Temperature();

    @Test
    public void convertTemperature() {
        assertEquals(56, temp.convertTemperature("K","K", 56));
        assertEquals(-217.14999999999998, temp.convertTemperature("C","K", 56));
        assertEquals(329.15, temp.convertTemperature("K","C", 56));
        assertEquals(132.8, temp.convertTemperature("F","C", 56));
        assertEquals(-358.86999999999995, temp.convertTemperature("F","K", 56));
        assertEquals(13.333333333333334, temp.convertTemperature("C","F", 56));
        assertEquals(286.8333333333333, temp.convertTemperature("K","F", 56));

    }

    @Test
    public void convertTemperatureError() {
        try {
            temp.convertTemperature("T","K", 56);
        } catch (IllegalStateException e) {
            assertEquals("Math toUnit is not valid", e.getMessage());
        }
    }

}