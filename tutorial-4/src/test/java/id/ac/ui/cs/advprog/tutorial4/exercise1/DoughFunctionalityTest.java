package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.DepokCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThickCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThinCrustDough;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoughFunctionalityTest {
    private Dough depokCrustDough;
    private Dough thickCrustDough;
    private Dough thinCrustDough;

    @Before
    public void setUp() throws Exception {
        depokCrustDough = new DepokCrustDough();
        thickCrustDough = new ThickCrustDough();
        thinCrustDough = new ThinCrustDough();
    }

    @Test
    public void testDoughOutput() {
        assertEquals("DepokCrust style extra Depok crust dough", depokCrustDough.toString());
        assertEquals("ThickCrust style extra thick crust dough",thickCrustDough.toString());
        assertEquals("Thin Crust Dough",thinCrustDough.toString());
    }

}
