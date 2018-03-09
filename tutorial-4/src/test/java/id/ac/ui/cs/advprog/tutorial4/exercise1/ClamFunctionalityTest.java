package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.DepokClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FreshClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FrozenClams;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClamFunctionalityTest {
    private Clams frozenClams;
    private Clams freshClams;
    private Clams depokClams;

    @Before
    public void setUp() throws Exception {
        freshClams = new FreshClams();
        frozenClams = new FrozenClams();
        depokClams = new DepokClams();

    }

    @Test
    public void testClamsOutput(){
        assertEquals("Fresh Clams from Long Island Sound",freshClams.toString());
        assertEquals("Frozen Clams from Chesapeake Bay",frozenClams.toString());
        assertEquals("Depok Clams from Depok",depokClams.toString());
    }

}
