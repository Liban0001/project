package tests;

import org.junit.Test;  // Corrected annotation
import static org.junit.Assert.assertEquals;  // Added import

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }
}