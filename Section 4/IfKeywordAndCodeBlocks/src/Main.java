public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score was less than 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }


        // Challenge

        boolean newgameOver = true;
        int newscore = 10000;
        int newlevelCompleted = 8;
        int newbonus = 200;

        if(gameOver == true) {
            int newfinalScore = newscore + (newlevelCompleted * newbonus);
            System.out.println("Your final score was " + newfinalScore);
        }

    }
}
