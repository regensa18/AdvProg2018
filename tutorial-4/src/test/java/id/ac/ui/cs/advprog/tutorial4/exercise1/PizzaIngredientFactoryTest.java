package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertTrue;

public class PizzaIngredientFactoryTest {
    private Class<?> pizzaIngredientFactoryClass;

    @Before
    public void setUp() throws Exception {
        pizzaIngredientFactoryClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.PizzaIngredientFactory");
    }

    @Test
    public void testPizzaIngredientFactoryIsAPublicInterface() {
        int classModifiers = pizzaIngredientFactoryClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

}
