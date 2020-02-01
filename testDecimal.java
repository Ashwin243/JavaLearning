import java.util.Scanner;

public class testDecimal {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {

       return ((int)(num1 * 1000) == (int)(num2 * 1000));
    }
       //public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
          // if (x > y) {
            //   return ((x - y) < 0.0009);

           //}
           //else if (y > x) {
              // return ((y - x) < 0.0009);
           //}
           //else if (x == y) {
             //  return x == y;
           //}
           //return false;

       //}
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=number.nextDouble();
        System.out.print("Enter Second number: ");
        double num2=number.nextDouble();
        boolean test=areEqualByThreeDecimalPlaces(num1,num2);
        System.out.println(test);
        System.out.println(num1- num2);
        //int num3=(int)(num1*1000);
        //int num4=(int)(num2*1000);
        //double num3=num1*1000;
        //double num4=num2*1000;
        //System.out.println(num3);
        //System.out.println(num4);

    }
}
