package game;

/**
 * Created by billy on 9/27/16.
 * Edited by hafiyyan94 on 4/10/18
 * ☺☺☺☺☺☺☻☻☻☻☻☻
 */

public class NewMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new QuestGenerator(new Counter()));
        thread.start();
    }
}
