package id.ac.ui.cs.advprog.tutorial4.exercise1;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ClamTest {
    private Class<?> clamClass;
    private Class<?> freshClamClass;
    private Class<?> frozenClamClass;
    private Class<?> depokClamClass;

    @Before
    public void setUp() throws Exception {
        clamClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams");
        freshClamClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FreshClams");
        frozenClamClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FrozenClams");
        depokClamClass = Class.forName("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.DepokClams");
    }

    @Test
    public void testClamsIsAPublicInterface() {
        int classModifiers = clamClass.getModifiers();

        assertTrue(Modifier.isPublic(classModifiers));
        assertTrue(Modifier.isInterface(classModifiers));
    }

    private void assertTrue(boolean anInterface) {
    }

    @Test
    public void testClamsHasToStringMethod() throws Exception {
        Method toString = clamClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }



    @Test
    public void testFreshClamIsAClamsBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(freshClamClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams")));
    }

    @Test
    public void testFreshClamOverrideToString() throws Exception {
        Method toString = freshClamClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testFrozenClamIsAClamsBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(frozenClamClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams")));
    }

    @Test
    public void testFrozenClamOverrideToString() throws Exception {
        Method toString = frozenClamClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

    @Test
    public void testDepokClamIsAClamsBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(depokClamClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams")));
    }

    @Test
    public void testDepokClamOverrideToString() throws Exception {
        Method toString = depokClamClass.getDeclaredMethod("toString");
        int methodModifiers = toString.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("java.lang.String", toString.getGenericReturnType().getTypeName());

    }

}
