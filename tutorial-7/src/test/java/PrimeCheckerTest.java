import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeCheckerTest {

    private static final List<Integer> PRIME_NUMBERS = Arrays.asList(2, 3, 5, 7);
    private static final List<Integer> NOT_PRIME = Arrays.asList(4,6);

    @Test
    public void testIsPrimeTrueGivenPrimeNumbers() {
        PRIME_NUMBERS.forEach(number -> assertTrue(PrimeChecker.isPrime(number)));
    }

    @Test
    public void testIsPrimeFalseGivenNonPrimeNumbers() {
        // Given non-prime numbers
        // When isPrime is invoked
        // It should return false
        NOT_PRIME.forEach(number -> assertFalse(PrimeChecker.isPrime(number)));
    }
}