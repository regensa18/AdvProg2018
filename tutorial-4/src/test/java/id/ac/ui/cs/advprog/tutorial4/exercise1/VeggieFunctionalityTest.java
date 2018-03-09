package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeggieFunctionalityTest {
    private Veggies blackOlives;
    private Veggies eggplant;
    private Veggies garlic;
    private Veggies mushroom;
    private Veggies onion;
    private Veggies redPepper;
    private Veggies spinach;
    private Veggies depokVeg;

    @Before
    public void setUp() throws Exception {
        blackOlives = new BlackOlives();
        eggplant = new Eggplant();
        garlic = new Garlic();
        mushroom = new Mushroom();
        onion = new Onion();
        redPepper = new RedPepper();
        spinach = new Spinach();
        depokVeg = new DepokVeg();
    }

    @Test
    public void testVeggiesOutput() {
        assertEquals("Black Olives", blackOlives.toString());
        assertEquals("Eggplant", eggplant.toString());
        assertEquals("Garlic", garlic.toString());
        assertEquals("Mushrooms", mushroom.toString());
        assertEquals("Onion", onion.toString());
        assertEquals("Red Pepper", redPepper.toString());
        assertEquals("Spinach", spinach.toString());
        assertEquals("DepokVeg", depokVeg.toString());
    }



}
