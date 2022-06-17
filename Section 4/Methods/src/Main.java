public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Adam", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Walter", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("DingDong", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("ASweatyPenis", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("VaginaMonologue", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("FagPin", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("ABigOlDumbass", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1; // typically used to indicate an error
        }
    }

    // Challenge

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position # " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;  // assuming position 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if ((score >= 500)) {
            position = 2;
        } else if ((score >= 100)) {
            position = 3;
        }
        return position;

    }
    // -------------------------------------------------------------



}