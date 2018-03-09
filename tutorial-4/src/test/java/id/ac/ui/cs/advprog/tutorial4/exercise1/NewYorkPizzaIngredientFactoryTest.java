package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class NewYorkPizzaIngredientFactoryTest {
    private Class<?> newYorkPizzaIngredientFactoryClass;

    @Before
    public void setUp() throws Exception {
        newYorkPizzaIngredientFactoryClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.NewYorkPizzaIngredientFactory");
    }

    @Test
    public void testNewYorkPizzaIngredientFactoryIsAPizzaIngredientFactoryBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(newYorkPizzaIngredientFactoryClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.PizzaIngredientFactory")));

    }

    @Test
    public void testNewYorkPizzaOverrideMethodCreateDough() throws Exception {
        Method createDough = newYorkPizzaIngredientFactoryClass.getDeclaredMethod("createDough");
        int methodModifiers = createDough.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough", createDough.getGenericReturnType().getTypeName());

    }

    @Test
    public void testNewYorkPizzaOverrideMethodCreateSauce() throws Exception {
        Method createSauce = newYorkPizzaIngredientFactoryClass.getDeclaredMethod("createSauce");
        int methodModifiers = createSauce.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce", createSauce.getGenericReturnType().getTypeName());

    }

    @Test
    public void testNewYorkPizzaOverrideMethodCreateCheese() throws Exception {
        Method createCheese = newYorkPizzaIngredientFactoryClass.getDeclaredMethod("createCheese");
        int methodModifiers = createCheese.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese", createCheese.getGenericReturnType().getTypeName());

    }

    @Test
    public void testNewYorkPizzaOverrideMethodCreateVeggies() throws Exception {
        Method createVeggies = newYorkPizzaIngredientFactoryClass.getDeclaredMethod("createVeggies");
        int methodModifiers = createVeggies.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies[]", createVeggies.getGenericReturnType().getTypeName());

    }

    @Test
    public void testNewYorkPizzaOverrideMethodCreateClams() throws Exception {
        Method createClam = newYorkPizzaIngredientFactoryClass.getDeclaredMethod("createClam");
        int methodModifiers = createClam.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams", createClam.getGenericReturnType().getTypeName());

    }

}
