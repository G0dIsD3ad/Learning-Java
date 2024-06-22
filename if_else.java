
public class if_else {

    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.print("Your final score was " + finalScore);
        }
    }
}
