import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;
    @BeforeAll
    static void setUp(){
        temperatureConverter = new TemperatureConverter();
        System.out.println("Very intelectual property of Pop Alex. Please do not steal.");
    }
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0d, temperatureConverter.fahrenheitToCelsius(32d),0.1);
        assertEquals(6.7d, temperatureConverter.fahrenheitToCelsius(44.06d),0.1);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(0d, temperatureConverter.celsiusToFahrenheit(-17.77d),0.1);
        assertEquals(100d,temperatureConverter.celsiusToFahrenheit(37.77d),0.1);
    }

    @Test
    void testIsExtremeTemperature() {
        assertFalse(temperatureConverter.isExtremeTemperature(32d));
        assertTrue(temperatureConverter.isExtremeTemperature(60.55d));
        assertTrue(temperatureConverter.isExtremeTemperature(-41d));
        assertFalse(temperatureConverter.isExtremeTemperature(50d));
    }
}