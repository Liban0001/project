
import org.junit.Test;  // Corrected annotation
import static org.junit.Assert.assertEquals;  // Added import

public class CalculatorTest {
    Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply(){
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivision(){
        assertEquals(6, calculator.division(12, 2));
    }


}