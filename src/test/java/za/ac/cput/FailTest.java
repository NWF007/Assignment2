package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailTest {

    private Fail fail;
    @Before
    public void setUp() throws Exception {
        fail = new Fail();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void squareRoot() {
        double result = fail.squareRoot(0, 5);

        Assert.assertEquals(1, result, -1);
    }
}