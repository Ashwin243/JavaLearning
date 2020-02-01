//Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//        If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers,
//        such as 2 in 12 and 23; otherwise, the method should return false.
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
public class testShared {

    public static boolean hasSharedDigit(int num1,int num2) {
        int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0;
        if (num1 >9 && num1 < 100 && num2 > 9 && num2 < 100) {
            return (((num1 % 10) == num2 % 10) || (num1 % 10 == (num2 /10)) ||
                    ((num1 / 10) == num2 % 10) || ((num1 / 10) == (num2 / 10)));
        }
        return false;
    }
//
//            digit1 = num1 % 10;
//            System.out.println(digit1);
//            digit2 = num2 % 10;
//            System.out.println(digit2);
//            num1 /= 10;
//            num2 /= 10;
//            digit3 = num1 % 10;
//            System.out.println(digit3);
//            digit4 = num2 % 10;
//            System.out.println(digit4);
//            if ((digit1 == digit2) || (digit1 == digit4) || (digit3 == digit2) || (digit3 == digit4)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        boolean a=hasSharedDigit(55,50);
        System.out.println(a);

    }
}
