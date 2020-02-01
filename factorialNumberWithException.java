import java.util.*;
public class factorialNumberWithException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n, c, fact = 1;
        int intheend = 1;
        System.out.println("FACTORIAL NUMBER SOLVER USING EXCEPTION");
        System.out.println("***************************************");
 //       System.out.println("\n");
        while(intheend==1) {

            try {
                System.out.print("Give a Number : ");
                int num_value =sc.nextInt();
                int staticnum_value=num_value;
                if (num_value < 0) {
                    System.out.println("Number should be non-negative.");
                }
                else
                {     while(num_value!=1)
                {
                    fact=fact*num_value;
                    num_value--;

                    }
                    System.out.println("Factorial value of "
                            + staticnum_value +" is "+fact +".");
                }
                System.out.println("\n");
                intheend = 0;
            } catch(InputMismatchException e) {
                sc.next();
                System.out.println("You Entered a Bad Data." );
                System.out.println("Please Try Again." );
                System.out.println("\n");
            }
        } // while loop end
        System.out.print("\t END OF PROGRAM");
//        System.out.println("\n");
    }
}
