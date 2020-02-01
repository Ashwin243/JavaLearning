import java.util.InputMismatchException;
import java.util.Scanner;

public class findOddOrEven {
    public static void main(String[] args) {
        int counter=1;
        Scanner input = new Scanner(System.in);
        while(counter==1) {
            try {
                System.out.print("Enter an Integer to check for Odd or Even: ");
                int number = input.nextInt();
                if (number % 2 == 0) {
                    System.out.println("Entered Number " + number + " is even");

                } else {
                    System.out.println("Entered Number " + number + " is odd");
                }
                counter=0;
            } catch (InputMismatchException a) {
                input.next();
                System.out.println("Wrong Input type entered");
                System.out.println("Please enter an Integer again to check for even or odd!");
//                System.out.println("\n");

            }
        }

    }

}

