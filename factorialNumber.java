import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number for which factorial has to be calculated: ");
        long number1 = number.nextLong();
        System.out.println("Factorial of " + number1 + " with recursion is " + factorial(number1));
        System.out.println("Factorial of " + number1 + " with iteration is " + fact(number1));

    }

    public static long factorial(long num) {
        if (num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }
    public static long fact(long num) {
        long abc = 1;
        while (num != 1) {
            abc = abc * (num);
            num--;
        }
        return abc;
    }
}


