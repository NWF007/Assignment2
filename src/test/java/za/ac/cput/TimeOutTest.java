package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeOutTest {

    TimeOut ti;

    @Before
    public void setUp() throws Exception {
        ti = new TimeOut();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1)
    public void modulus() {
        double res = ti.modulus(5,2);

        Assert.assertTrue(false);
    }
}