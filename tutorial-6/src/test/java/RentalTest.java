import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    Movie movie;
    Rental rent;

    // TODO: Remove redundancy in setting up test fixture in each test methods
    // Hint: Make the test fixture into an instance variable

    @Before
    public void setUp() {
        Movie movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        Rental rent = new Rental(movie, 3);
    }

    @Test
    public void getMovie() {
        Rental rent = new Rental(movie, 3);
        assertEquals(movie, rent.getMovie());
    }

    @Test
    public void getDaysRented() {
        assertEquals(3, rent.getDaysRented());
    }
}