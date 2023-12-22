public class Challenge48 {
    public static void main(String[] args){


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Hatem1", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Hatem2", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Hatem3", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Hatem4", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("Hatem5", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int HighScorePosition ){
        System.out.println(playerName + " managed to get into position " + HighScorePosition + " on the high score list");
    }
    public static int  calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
