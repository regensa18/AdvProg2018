package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CheeseTest {
    private Class<?> cheeseClass;
    private Class<?> depokCheeseClass;
    private Class<?> mozarellaCheeseClass;
    private Class<?> parmesanCheeseClass;
    private Class<?> reggianoCheeseClass;

    @Before
    public void setUp() throws Exception {
        cheeseClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese");
        depokCheeseClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.DepokCheese");
        mozarellaCheeseClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.MozzarellaCheese");
        parmesanCheeseClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.ParmesanCheese");
        reggianoCheeseClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.ReggianoCheese");
    }

    @Test
    public void testCheeseIsAPublicInterface() {
        int classModifiers = cheeseClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

    @Test
    public void testCheeseHasToStringMethod() throws Exception {
        Method toString = depokCheeseClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());
    }

    @Test
    public void testDepokCheeseIsACheeseBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokCheeseClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese")));
    }

    @Test
    public void testDepokCheeseOverrideToString() throws Exception {
        Method toString = depokCheeseClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


    @Test
    public void testMozarellaCheeseIsACheeseBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(mozarellaCheeseClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese")));
    }

    @Test
    public void testMozarellaCheeseOverrideToString() throws Exception {
        Method toString = mozarellaCheeseClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


    @Test
    public void testParmesanCheeseIsACheeseBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(parmesanCheeseClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese")));
    }

    @Test
    public void testParmesanCheeseOverrideToString() throws Exception {
        Method toString = parmesanCheeseClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testReggianoCheeseIsACheeseBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(reggianoCheeseClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese")));
    }

    @Test
    public void testReggianoCheeseOverrideToString() throws Exception {
        Method toString = reggianoCheeseClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }


}
