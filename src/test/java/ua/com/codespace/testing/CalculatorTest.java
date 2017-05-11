package ua.com.codespace.testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator unit = new Calculator();

    @Test
    public void addTwoDigitsResultSum() throws Exception {
        int result = unit.add(3, 7);
        Assert.assertEquals(10, result);
    }

    @Test
    public void sqrt() throws Exception {
        double result = unit.sqrt(4);
        Assert.assertEquals(2,result, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegativeValueExceptionThrown() throws Exception {
        unit.sqrt(-2);
    }
}