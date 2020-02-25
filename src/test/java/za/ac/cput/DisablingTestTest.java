package za.ac.cput;

import org.junit.*;

import static org.junit.Assert.*;

public class DisablingTestTest {

    DisablingTest a;

    @Before
    public void setUp() throws Exception {
        a = new DisablingTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Ignore
    @Test
    public void div() {
        double res = a.div(4,2);

        Assert.assertEquals(2, res, 0);
    }
}