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

public class VeggieTest {
    private Class<?> veggiesClass;
    private Class<?> blackOlivesClass;
    private Class<?> eggplantClass;
    private Class<?> garlicClass;
    private Class<?> mushroomClass;
    private Class<?> onionClass;
    private Class<?> redPepperClass;
    private Class<?> spinachClass;
    private Class<?> depokVegClass;

    @Before
    public void setUp() throws Exception {
        veggiesClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies");
        blackOlivesClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.BlackOlives");
        eggplantClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Eggplant");
        garlicClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Garlic");
        mushroomClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Mushroom");
        onionClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Onion");
        redPepperClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.RedPepper");
        spinachClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Spinach");
        depokVegClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.DepokVeg");
    }

    @Test
    public void testVegIsAPublicInterface() {
        int classModifiers = veggiesClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

    @Test
    public void testVegHasToStringMethod() throws Exception {
        Method toString = veggiesClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testBlackOlivesIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(blackOlivesClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testBlackOlivesOverrideToString() throws Exception {
        Method toString = blackOlivesClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testEggplantsIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(eggplantClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testEggplantOverrideToString() throws Exception {
        Method toString = eggplantClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


    @Test
    public void testGarlicIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(garlicClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testGarlicOverrideToString() throws Exception {
        Method toString = garlicClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testMushroomIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(mushroomClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testMushroomOverrideToString() throws Exception {
        Method toString = mushroomClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testOnionIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(onionClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testOnionOverrideToString() throws Exception {
        Method toString = onionClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


    @Test
    public void testRedPepperIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(redPepperClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testRedPepperOverrideToString() throws Exception {
        Method toString = redPepperClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testSpinachIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(spinachClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testSpinachOverrideToString() throws Exception {
        Method toString = spinachClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokVegIsAVeggiesBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokVegClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies")));
    }

    @Test
    public void testDepokVegOverrideToString() throws Exception {
        Method toString = depokVegClass .getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }







}
