package tests;

import org.junit.est;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(1, 2));
    }
}
