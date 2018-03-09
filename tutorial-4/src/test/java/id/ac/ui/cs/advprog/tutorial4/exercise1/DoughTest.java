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

public class DoughTest {
    private Class<?> doughClass;
    private Class<?> thinCrustClass;
    private Class<?> thickCrustClass;
    private Class<?> depokCrustClass;

    @Before
    public void setUp() throws Exception {
        doughClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough");
        depokCrustClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.DepokCrustDough");
        thinCrustClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThinCrustDough");
        thickCrustClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThickCrustDough");
    }

    @Test
    public void testDoughIsAPublicInterface() {
        int classModifiers = doughClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

    @Test
    public void testDoughHasToStringMethod() throws Exception {
        Method toString = doughClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testThinCrustIsADoughBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(thinCrustClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough")));
    }

    @Test
    public void testThinCrustOverrideToString() throws Exception {
        Method toString = thinCrustClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testThickCrustIsADoughBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(thickCrustClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough")));
    }

    @Test
    public void testThickCrustOverrideToString() throws Exception {
        Method toString = thickCrustClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokCrustIsADoughBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokCrustClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough")));
    }

    @Test
    public void testDepokCrustOverrideToString() throws Exception {
        Method toString = depokCrustClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

}
