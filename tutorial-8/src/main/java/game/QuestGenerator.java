package game;

import java.util.Random;
import java.util.Scanner;

public class QuestGenerator implements Runnable {
    private final int TOTAL_QUEST = 10;
    private final int RIGHT_BELOW_THRESHOLD_POINT = 10;
    private final int RIGHT_ABOVE_THRESHOLD_POINT = 5;
    private final int WRONG_POINT = 0;
    private final int QUEST_TYPE_ADD = 0;
    private final int QUEST_TYPE_SUBSTR = 1;
    private final int QUEST_TYPE_MULTIPL = 2;
    private final int QUEST_TYPE_DIVS = 3;
    private Counter counter;

    public QuestGenerator(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String startNewQuestsIpt;
        int thresholdTime;
        int totalRightBelowThreshold;
        int totalRightAboveThreshold;
        int totalWrong;
        Thread counterThread;

        do {
            // initialize value
            startNewQuestsIpt = "";
            totalRightBelowThreshold = 0;
            totalRightAboveThreshold = 0;
            totalWrong = 0;

            // Asking for asnwering question threshold time
            System.out.print("How much time do you need "
                + "to answer each question? (In second) ");
            String rawInput = scanner.nextLine();
            thresholdTime = rawInput.isEmpty() ? 20 : Integer.parseInt(rawInput);

            counterThread = new Thread(counter);
            counterThread.start();
            for (int questNo = 1; questNo <= TOTAL_QUEST; questNo++) {
                System.out.print(questNo + ") ");
                Random rand = new Random();
                Fraction firstPosFrac = new Fraction(rand.nextInt(40) - 20,
                    rand.nextInt(40) - 20);
                Fraction secondPosFrac = new Fraction(rand.nextInt(40) - 20,
                    rand.nextInt(40) - 20);
                Fraction expectedAnswer;

                switch (rand.nextInt(3)) {
                    case QUEST_TYPE_ADD:
                        System.out.print(firstPosFrac.toString() + "  +  "
                            + secondPosFrac.toString() + "  =  ");
                        expectedAnswer = firstPosFrac.getAddition(secondPosFrac);
                        break;
                    case QUEST_TYPE_SUBSTR:
                        System.out.print(firstPosFrac.toString() + "  -  "
                            + secondPosFrac.toString() + "  =  ");
                        expectedAnswer = firstPosFrac.getSubstraction(secondPosFrac);
                        break;
                    case QUEST_TYPE_MULTIPL:
                        System.out.print(firstPosFrac.toString() + "  *  "
                            + secondPosFrac.toString() + "  =  ");
                        expectedAnswer = firstPosFrac.getMultiplication(secondPosFrac);
                        break;
                    case QUEST_TYPE_DIVS:
                        System.out.print(firstPosFrac.toString() + "  :  "
                            + secondPosFrac.toString() + "  =  ");
                        expectedAnswer = firstPosFrac.getDivision(secondPosFrac);
                        break;
                    default:
                        System.out.println("Oooops!");
                        expectedAnswer = new Fraction();
                }

                // Asking for question
                String rawAns = scanner.nextLine();

                // Process user answer
                Fraction userAnswer;
                if (rawAns.contains("/")) {
                    String[] ans = rawAns.split("/");
                    userAnswer = new Fraction(Integer.parseInt(ans[0]),
                        Integer.parseInt(ans[1]));
                } else {
                    userAnswer = new Fraction(Integer.parseInt(rawAns));
                }
                int currentTime = counter.getCurrentTime();

                // Check answer
                if (expectedAnswer.isEqual(userAnswer)) {
                    if (currentTime <= thresholdTime) {
                        counter.addOnSideScore();
                    } else {
                        counter.addOffSideScore();
                    }
                }
                System.out.println("Current score: " + counter.value());
                System.out.println("Elapsed time: " + currentTime + "\n\n");
                counter.resetQuestTime();
            }

            // Print the result
            System.out.println("\n=========Result==========");
            System.out.println("Right answer and within time limit  =  "
                + totalRightBelowThreshold);
            System.out.println("Right answer but over time limit  =  "
                + totalRightAboveThreshold);
            System.out.println("Wrong answer  =  " + totalWrong);

            int totalPoint = counter.value();
            System.out.println("\nTotal point acquired : " + totalPoint);
            System.out.println("Total time: " + counter.getTotalTime());

            System.out.println("\n");

            // Asking if user want to start a new questions
            // if the respond is not what we want, ask it again and again
            while (!startNewQuestsIpt.equalsIgnoreCase("y")
                && !startNewQuestsIpt.equalsIgnoreCase("n")) {
                System.out.println("Restart the quiz? [y/n]");
                startNewQuestsIpt = scanner.nextLine();
            }
            System.out.println("\n\n\n\n\n\n");
        } while (startNewQuestsIpt.equalsIgnoreCase("y"));
    }
}
