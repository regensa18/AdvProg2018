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

public class SauceTest {
    private Class<?> sauceClass;
    private Class<?> depokSauceClass;
    private Class<?> marinaraSauceClass;
    private Class<?> plumTomatoClass;

    @Before
    public void setUp() throws Exception{
        sauceClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce");
        depokSauceClass  = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.DepokSauce");
        marinaraSauceClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.MarinaraSauce");
        plumTomatoClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.PlumTomatoSauce");
    }

    @Test
    public void testSauceIsAPublicInterface() {
        int classModifiers = sauceClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

    @Test
    public void testDepokSauceIsASauceBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokSauceClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce")));
    }

    @Test
    public void testDepokSauceOverrideToString() throws Exception {
        Method toString = depokSauceClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testMarinaraSauceIsASauceBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(marinaraSauceClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce")));
    }

    @Test
    public void testMarinaraSauceOverrideToString() throws Exception {
        Method toString = marinaraSauceClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


    @Test
    public void testPlumTomatoSauceIsASauceBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(plumTomatoClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce")));
    }

    @Test
    public void testPlumTomatoSauceOverrideToString() throws Exception {
        Method toString = plumTomatoClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }








}
