public class testMethod {

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println( name +  " managed to get into position " + position +
                " on the high score table");
    }

    public static void main(String args[]) {

                int rank = calculateHighScorePosition(1000);
                displayHighScorePosition("Ashwin", rank);
                rank = calculateHighScorePosition(900);
                displayHighScorePosition("Meanie", rank);
                rank = calculateHighScorePosition(400);
                displayHighScorePosition("ABC", rank);
                rank = calculateHighScorePosition(50);
                displayHighScorePosition("XYZ", rank);


        }

    }

