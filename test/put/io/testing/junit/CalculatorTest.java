package put.io.testing.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void testAdd() {
        assertEquals(6, calculator.add(1, 5));
        assertEquals(6, calculator.add(5, 1));
        assertEquals(0, calculator.add(-10, 10));
        assertEquals(-2, calculator.add(10, -12));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(-60, calculator.multiply(-20, 3));
        assertEquals(0, calculator.multiply(-20, 0));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAddPositiveNumbers() {
        calculator.addPositiveNumbers(-10, 2);
    }

}