import java.util.InputMismatchException;
import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int num){
        int remainder=0;
        int rev=0;
        int highestNum = (int) (Math.pow(2,31) - 1);
        int leastNum = (int) Math.pow(2,-31);
            while(num!=0 && (num < highestNum) && (num > highestNum) )
        {
            remainder = num%10;
            rev = rev*10 + remainder;
            num = num/10;

        }
        return rev;

    }
    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);
        boolean executeTillEnd = false;
//        int abc=1;
        while (!executeTillEnd) {
            try {
                System.out.print("Enter a number to reverse:");
                int num1 = number.nextInt();
                System.out.println(" Reversal of " + num1 + " is " + reverse(num1));
                executeTillEnd = true;
//                abc=0;
            } catch (InputMismatchException e) {
                number.next();
                System.out.println("Entered input is not a number, Please renter");
                System.out.println("\n");
            }

        }
    }



}



