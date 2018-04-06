/**
 * 1st exercise.
 */
import java.util.stream.IntStream;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        return number > 1
            && IntStream.range(2, number)
            .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("isPrime(%d)? %b", i, isPrime(i)));
        }
    }
}
