package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjEqualityTest {

    Person p;
    Dog d;
    ObjEquality o;
    @Before
    public void setUp() throws Exception {
        p = new Person();
        d = new Dog();
        o = new ObjEquality();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquals() {

        boolean result = o.equals(p,d);
        Assert.assertEquals(false, result);
    }
}