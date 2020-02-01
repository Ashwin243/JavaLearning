import java.util.InputMismatchException;
import java.util.Scanner;

public class testNumber {
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);
        int intheend = 0;
        while (intheend == 0) {
           // Scanner number = new Scanner(System.in);
            try{
                System.out.print("Enter the number to check: ");
                int num=number.nextInt();
                System.out.print("Number " + num + " is ");
                checkNumber(num);
                intheend++;

            }
            catch(InputMismatchException ashwin){
                number.next();
                System.out.println("Entered data is not number, Please re-enter a valid number");
                System.out.println("\n");

            }
        }
    }
}
