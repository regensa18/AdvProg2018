package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PizzaTest {
    private Class<?> pizzaClass;

    @Before
    public void setUp() throws Exception {
        pizzaClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza");
    }

    @Test
    public void testPizzaIsAbstract() {
        int classModifiers = pizzaClass.getModifiers();

        assertTrue(Modifier.isAbstract(classModifiers));
    }

    @Test
    public void testPizzaHasBakeMethod() throws Exception {
        Method bake = pizzaClass.getDeclaredMethod("bake");
        int methodModifiers = bake.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", bake.getGenericReturnType().getTypeName());
    }

    @Test
    public void testPizzaHasCutMethod() throws Exception {
        Method cut = pizzaClass.getDeclaredMethod("cut");
        int methodModifiers = cut.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", cut.getGenericReturnType().getTypeName());
    }

    @Test
    public void testPizzaHasBoxMethod() throws Exception {
        Method box = pizzaClass.getDeclaredMethod("box");
        int methodModifiers = box.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", box.getGenericReturnType().getTypeName());
    }

    @Test
    public void testPizzaHasNameSetter() throws Exception {
        Method setName = pizzaClass.getDeclaredMethod("setName",
                String.class);
        Collection<Parameter> parameters = Arrays.asList(setName.getParameters());
        int methodModifiers = setName.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }

    @Test
    public void testPizzaHasNameGetter() throws Exception {
        Method getName = pizzaClass.getDeclaredMethod("getName");
        Collection<Parameter> parameters = Arrays.asList(getName.getParameters());
        int methodModifiers = getName.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }

    @Test
    public void testPizzaHasToStringMethod() throws Exception {
        Method getName = pizzaClass.getDeclaredMethod("toString");
        Collection<Parameter> parameters = Arrays.asList(getName.getParameters());
        int methodModifiers = getName.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }

}
