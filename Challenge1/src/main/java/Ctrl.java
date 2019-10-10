public class Ctrl {

    public int challenge(boolean gameOver, int score, int levelCompleted, int bonus) {
        int result = 0;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            result = finalScore;
        }
        return result;

    }

}
