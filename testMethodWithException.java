import java.util.InputMismatchException;
import java.util.Scanner;

public class testMethodWithException {

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500)) {
            return 2;
        } else if ((score >= 100)) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String name, int position, int score) {
        System.out.println( name + " with score " + score + " managed to get into position " + position +
                " on the high score table");
    }

    public static void main(String args[]) {
        Scanner test = new Scanner(System.in);
        boolean executeTillEnd=false;
        int c=1;
        System.out.print("Enter Player name: ");
        String playerName = test.nextLine();
        while(!executeTillEnd) {
            try {
                if(c<4) {
                    System.out.println("Iteration number:" + c);
                    //System.out.print("Enter the name: ");
                    //String playerName = test.nextLine();
                    System.out.print("Enter the Score for " + playerName + " : ");
                    double playerScore = test.nextDouble();
                    int roundedPlayerScore = (int) Math.ceil(playerScore);
                    int rank = calculateHighScorePosition(roundedPlayerScore);
                    displayHighScorePosition(playerName, rank, roundedPlayerScore);
                }
                else{
                   System.out.println("Maximum times wrong score entered for " + playerName);
                }
                executeTillEnd = true;
            } catch (InputMismatchException ashwin) {
                test.nextLine();
                //test.nextDouble();
                c++;
                System.out.println("\n");
                System.out.println("Please re-enter a number as score");
                System.out.println("\n");
            }
        }

    }
}
