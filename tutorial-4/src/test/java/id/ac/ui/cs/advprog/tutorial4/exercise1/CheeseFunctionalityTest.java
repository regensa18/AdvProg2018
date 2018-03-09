package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CheeseFunctionalityTest {
    private Cheese depokCheese;
    private Cheese mozzarellaCheese;
    private Cheese parmesanCheese;
    private Cheese reggianoCheese;

    @Before
    public void setUp() throws Exception{
        depokCheese = new DepokCheese();
        mozzarellaCheese = new MozzarellaCheese();
        parmesanCheese = new ParmesanCheese();
        reggianoCheese = new ReggianoCheese();
    }

    @Test
    public void testCheeseOutput(){
        assertEquals("Shredded Depok",depokCheese.toString());
        assertEquals("Shredded Mozzarella",mozzarellaCheese.toString());
        assertEquals("Shredded Parmesan",parmesanCheese.toString());
        assertEquals("Reggiano Cheese",reggianoCheese.toString());
    }


}
