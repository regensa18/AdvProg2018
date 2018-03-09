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

public class DepokPizzaIngredientFactoryTest {
    private Class<?> depokPizzaIngredientFactoryClass;

    @Before
    public void setUp() throws Exception {
        depokPizzaIngredientFactoryClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.DepokPizzaIngredientFactory");
    }

    @Test
    public void testDepokPizzaIngredientFactoryIsAPizzaIngredientFactoryBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokPizzaIngredientFactoryClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.PizzaIngredientFactory")));

    }

    @Test
    public void testDepokPizzaOverrideMethodCreateDough() throws Exception {
        Method createDough = depokPizzaIngredientFactoryClass.getDeclaredMethod("createDough");
        int methodModifiers = createDough.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough", createDough.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokPizzaOverrideMethodCreateSauce() throws Exception {
        Method createSauce = depokPizzaIngredientFactoryClass.getDeclaredMethod("createSauce");
        int methodModifiers = createSauce.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce", createSauce.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokPizzaOverrideMethodCreateCheese() throws Exception {
        Method createCheese = depokPizzaIngredientFactoryClass.getDeclaredMethod("createCheese");
        int methodModifiers = createCheese.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese", createCheese.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokPizzaOverrideMethodCreateVeggies() throws Exception {
        Method createVeggies = depokPizzaIngredientFactoryClass.getDeclaredMethod("createVeggies");
        int methodModifiers = createVeggies.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies[]", createVeggies.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokPizzaOverrideMethodCreateClams() throws Exception {
        Method createClam = depokPizzaIngredientFactoryClass.getDeclaredMethod("createClam");
        int methodModifiers = createClam.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams", createClam.getGenericReturnType().getTypeName());

    }








}
