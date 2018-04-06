package applicant;

import java.util.function.Predicate;

/**
 * 4th exercise.
 */
public class Applicant {

    public boolean isCredible() {
        return true;
    }

    public int getCreditScore() {
        return 700;
    }

    public int getEmploymentYears() {
        return 10;
    }

    public boolean hasCriminalRecord() {
        return true;
    }

    public static boolean evaluate(Applicant applicant, Predicate<Applicant> evaluator) {
        return evaluator.test(applicant);
    }

    private static void printEvaluation(boolean result) {
        String msg = "Result of evaluating applicant: %s";
        msg = result ? String.format(msg, "accepted") : String.format(msg, "rejected");

        System.out.println(msg);
    }

    public static void main(String[] args) {
        Applicant applicant = new Applicant();

        Predicate<Applicant> qualifiedEvaluator =
                Applicant::isCredible;

        Predicate<Applicant> creditEvaluator =
            applicantt -> applicantt.getCreditScore() > 600;

        Predicate<Applicant> employmentEvaluator =
            applicantt -> applicantt.getEmploymentYears() > 0;

        Predicate<Applicant> crimeCheck =
            applicantt -> !applicantt.hasCriminalRecord();

        printEvaluation(evaluate(applicant, qualifiedEvaluator.and(creditEvaluator)));

        printEvaluation(evaluate(applicant, qualifiedEvaluator.and(employmentEvaluator)));

        printEvaluation(evaluate(applicant, qualifiedEvaluator
            .and(employmentEvaluator).and(crimeCheck)));

        printEvaluation(evaluate(applicant, qualifiedEvaluator
                .and(employmentEvaluator).and(creditEvaluator).and(crimeCheck)));
    }
}
