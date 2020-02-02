import java.util.InputMismatchException;
import java.util.Scanner;

public class testMethodOverloading {
    public static void average(String studentname, int score1, int score2, int score3, int score4, int score5) {
        //int total = score1 + score2 + score3 + score4 + score5;
        // int avg = (total) / 5;
        if (ispass(score1) == 1 && ispass(score2) == 1 && ispass(score3)==1 && ispass(score4)==1 && ispass(score5)==1) {
            int total = score1 + score2 + score3 + score4 + score5;
            int avg = (total) / 5;
                if (avg >= 90) {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and secured A+ grade overall");
                } else if (avg >= 75 && avg < 90) {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and secured A grade overall");
                } else if (avg >= 60 && avg < 75) {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and secured B grade overall");
                } else if (avg >= 50 && avg < 60) {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and secured C grade overall");
                } else if (avg >= 40 && avg < 50) {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and secured D grade overall");
                } else {
                    System.out.println(studentname + " has scored a total of " + total + " out of 500, with average of "
                            + avg + " and has just passed securing E grade overall, Please put more attention on studies");
                }

            }
        else if (ispass(score1) == 2 || ispass(score2) == 2 || ispass(score3)==2 || ispass(score4)==2 || ispass(score5)==2) {
            System.out.println("Score has to be in range of 0 to 100,Please re-enter the score");
        }
        else{
            System.out.println(studentname + " has failed in the exam, Please prepare better and give exam again");
        }
    }
        public static void hasFailed(String subject,int score){
            if (score >= 0 && score < 35) {
                System.out.println(subject+ " : FAIL");
                //return false;
            }
            else if(score >=35 && score <40){
                System.out.println(subject+ " : E ");
            }
            else if(score >=40 && score <50){
                System.out.println(subject+ " : D ");
            }
            else if(score >=50 && score <60){
                System.out.println(subject+ " : C ");
            }
            else if(score >=60 && score <75){
                System.out.println(subject+ " : B ");
            }
            else if(score >=75 && score <90){
                System.out.println(subject+ " : A ");
            }
            else if(score >=90 && score <=100){
                System.out.println(subject+ " : A+ ");
            }
            else{
                System.out.println(subject+ " : NA ");
            }
            //return true;
        }

        public static int ispass(int score){
            if (score >= 35 && score <=100) {
                //System.out.println(studentname + " has failed in " + subject + " with a score of " +score);
                return 1;
            }
            else if (score>=0 && score<35){
                return 0;
            }
            return 2;
        }

        public static void main (String[]args){
            boolean executeTillTheEnd = false;
            Scanner score = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
            Scanner s4 = new Scanner(System.in);
            Scanner s5 = new Scanner(System.in);
            System.out.print("Enter the name of the Student: ");
            String studentname = score.nextLine();
            while (!executeTillTheEnd) {
                try {
                    System.out.print("Enter first subject: ");
                    String subject1 = score.nextLine();
                    System.out.print("Enter the score for " + subject1 + " out of 100: ");
                    int score1 = score.nextInt();
                    //executeTillTheEnd=true;
                    System.out.print("Enter Second subject: ");
                    String subject2 = s2.nextLine();
                    System.out.print("Enter the score for " + subject2 + " out of 100: ");
                    int score2 = score.nextInt();
                    System.out.print("Enter Third subject: ");
                    String subject3 = s3.nextLine();
                    System.out.print("Enter the score for " + subject3 + " out of 100: ");
                    int score3 = score.nextInt();
                    System.out.print("Enter Fourth subject: ");
                    String subject4 = s4.nextLine();
                    System.out.print("Enter the score for " + subject4 + " out of 100: ");
                    int score4 = score.nextInt();
                    System.out.print("Enter Fifth subject: ");
                    String subject5 = s5.nextLine();
                    System.out.print("Enter the score for " + subject5 + " out of 100: ");
                    int score5 = score.nextInt();
                    System.out.print("\n");
                    System.out.println("**********************************************");
                    hasFailed(subject1,score1);
                    hasFailed(subject2,score2);
                    hasFailed(subject3,score3);
                    hasFailed(subject4,score4);
                    hasFailed(subject5,score5);
                    System.out.println("**********************************************");
                    average(studentname, score1, score2, score3, score4, score5);
                    executeTillTheEnd = true;
                } catch (InputMismatchException ashwin) {
                    score.nextLine();
                    System.out.println("\n");
                    System.out.println("Please re-enter score as a numeric value");
                    System.out.println("\n");
                }
            }
       }
}




