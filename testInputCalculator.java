//Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//
//        The method should not return anything (void) and it
//        needs to keep reading int numbers from the keyboard.
//        When the user enters something that is not an int then it needs
//        to print a message in the format "SUM = XX AVG = YY".
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        EXAMPLE 1:
//        INPUT:
//        1
//        2
//        3
//        4
//        5
//        a
//        OUTPUT
//        SUM = 15 AVG = 3
//
//        EXAMPLE 2:
//
//        INPUT:
//        hello
//        OUTPUT:
//        SUM = 0 AVG = 0
//
//        TIP: Use Scanner to read an input from the user.
//        TIP: Use casting when calling the round method since it needs double as a parameter.
//        NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
//        NOTE: Be mindful of spaces in the printed message.
//        NOTE: Be mindful of users who may type an invalid input right away (see example above).

import java.util.Scanner;

public class testInputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum=0,count=0;
        long avg=0;
        Scanner scanner=new Scanner(System.in);
        while(true){
            //System.out.print("Enter the Number: ");
            boolean isInt=scanner.hasNextInt();
            if(isInt){
                  int num=scanner.nextInt();
                  sum+=num;
                  count++;
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        avg = Math.round((double)sum/count);
            System.out.println("SUM = "+sum+ " AVG = "+avg);
        }
//public static void inputThenPrintSumAndAverage(){
//    int sum = 0;
//    double average = 0;
//    int count = 0;
//    Scanner scanner = new Scanner(System.in);
//    while(true){
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt){
//            count++;
//            sum += scanner.nextInt();
//            average = (double) sum / count;
//        }
//        else{
//            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
//            break;
//        }
//        scanner.nextLine();
//    }
//    scanner.close();
//}
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
