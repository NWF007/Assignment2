package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjIdentityTest {

    ObjIdentity a,b,c;

    ObjIdentity d = new ObjIdentity();
    @Before
    public void setUp() throws Exception {
        a = new ObjIdentity();
        b = a;
        c = new ObjIdentity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void iden() {
        boolean res = a.iden(a, d);
        Assert.assertEquals(true, res);
    }
}