import java.util.InputMismatchException;
import java.util.Scanner;

public class testLeapYear {
    public static boolean isLeapYear(int year){
        return (year>0 && year<10000) && ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }

    public static void main(String[] args) {
        //boolean year;
        //year=isLeapYear(2017);
        //System.out.println(year);
        //year=isLeapYear(-1600);
        //System.out.println(year);
        //year=isLeapYear(1700);
        //System.out.println(year);
        //year=isLeapYear(1924);
        //System.out.println(year);
        boolean executeTillEnd = false;
        Scanner year=new Scanner(System.in);
        while(!executeTillEnd){
            try{
                System.out.print("Enter the year:");
                int yearToCheck=year.nextInt();
                if (yearToCheck < 0){
                    System.out.println("Entered value of Year is lesser than zero");
                    System.out.println("Please re-enter the value for year greater than 0");
                    System.out.println("\n");
                   // executeTillEnd=true;
                }
                else if(yearToCheck > 9999){
                    System.out.println("Entered value of year is greater than 9999");
                    System.out.println("Please re-enter the value for year lesser than 9999");
                    System.out.println("\n");
                    //executeTillEnd=true;
                }
                else{
                    boolean test=isLeapYear(yearToCheck);
                    if(test){
                        System.out.println("Entered year " +yearToCheck+ " is a leap year");
                    }
                    else{
                        System.out.println("Entered year " +yearToCheck+ " is not a leap year");
                    }
                    executeTillEnd=true;

                }
            }
            catch(InputMismatchException ashwin){
                year.next();
                System.out.println("Entered Value for year is not a number");
                System.out.println("Please re-enter the value for year");
                System.out.println("\n");
            }
        }

    }
}
