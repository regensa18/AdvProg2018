package applicant;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static applicant.Applicant.evaluate;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ApplicantTest {
    // TODO Implement me!
    // Increase code coverage in Applicant class
    // by creating unit test(s)!
    Applicant applicant;
    Predicate<Applicant> qualifiedEvaluator;
    Predicate<Applicant> creditEvaluator;
    Predicate<Applicant> employmentEvaluator;
    Predicate<Applicant> crimeCheck;


    @Before
    public void setUp() {
        applicant = new Applicant();
        qualifiedEvaluator =
            Applicant::isCredible;
        creditEvaluator =
            applicantt -> applicantt.getCreditScore() > 600;
        employmentEvaluator =
            applicantt -> applicantt.getEmploymentYears() > 0;
        crimeCheck =
            applicantt -> !applicantt.hasCriminalRecord();
    }

    @Test
    public void testIfOutputIsCorrect() {
        assertTrue(evaluate(applicant, qualifiedEvaluator.and(creditEvaluator)));
        assertTrue(evaluate(applicant, qualifiedEvaluator.and(employmentEvaluator)));

        assertFalse(evaluate(applicant, qualifiedEvaluator
            .and(employmentEvaluator).and(crimeCheck)));
        assertFalse(evaluate(applicant, qualifiedEvaluator
            .and(employmentEvaluator).and(creditEvaluator).and(crimeCheck)));

    }
}
