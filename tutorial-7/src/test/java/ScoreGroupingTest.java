import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class ScoreGroupingTest {
    // TODO Implement me!
    // Increase code coverage in ScoreGrouping class
    // by creating unit test(s)!

    Map<String, Integer> scores;
    Map<Integer, List<String>> result;


    @Before
    public void setUp() {
        scores = new HashMap<>();

        scores.put("Alice", 12);
        scores.put("Bob", 15);
        scores.put("Charlie", 11);
        scores.put("Delta", 15);
        scores.put("Emi", 15);
        scores.put("Foxtrot", 11);

        result = ScoreGrouping.groupByScores(scores);
    }

    @Test
    public void testIfTheGroupingIsCorrect() {
        assertTrue(result.get(11).contains("Charlie"));
        assertTrue(result.get(11).contains("Foxtrot"));
        assertTrue(result.get(12).contains("Alice"));
        assertTrue(result.get(15).contains("Emi"));
        assertTrue(result.get(15).contains("Bob"));
        assertTrue(result.get(15).contains("Delta"));
    }

}