
public class methods_challenge {

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        
        return 4;
    }

    public static void displayHighScore(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the hight score list.");
    }

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScore("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScore("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScore("Gilbert", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(25);
        displayHighScore("Gilbert", highScorePosition);
    }

}
