package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.DepokSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.MarinaraSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.PlumTomatoSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SauceFunctionalityTest {
    private Sauce depokSauce;
    private Sauce marinaraSauce;
    private Sauce plumTomatoSauce;

    @Before
    public void setUp() throws Exception {
        depokSauce = new DepokSauce();
        marinaraSauce= new MarinaraSauce();
        plumTomatoSauce= new PlumTomatoSauce();

    }

    @Test
    public void testSauceOutput(){
        assertEquals("Depok sauce with plum Depok tomatoes", depokSauce.toString());
        assertEquals("Marinara Sauce",marinaraSauce.toString());
        assertEquals("Tomato sauce with plum tomatoes",plumTomatoSauce.toString());
    }


}
