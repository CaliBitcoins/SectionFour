import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CtrlTest {

    @Test
    public void challengeTest() {
        // Step 0 - Test IDE & Dependencies
        //fail("Test Passed");

        // Step 1 - Setup
        Ctrl test = new Ctrl();
        Ctrl test1 = new Ctrl();

        boolean gameOver = true;

        int score = 800;
        int score1 = 10000;

        int levelCompleted = 5;
        int levelCompleted1 = 8;

        int bonus = 100;
        int bonus1 = 200;

        // Step 2 - Exercise
        test.challenge(gameOver, score, levelCompleted, bonus);
        test1.challenge(gameOver, score1, levelCompleted1, bonus1);

        // Step 3 - Assert
        assertEquals(test.challenge(true, 800, 5, 100), 1300);
        assertEquals(test1.challenge(true, 10000, 8, 200), 11600);

        // Step 4 - Teardown

    }
}
