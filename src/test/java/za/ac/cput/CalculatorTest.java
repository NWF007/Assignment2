package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        int result = cal.sum(10, 10);
        Assert.assertEquals(20, result);
    }
}