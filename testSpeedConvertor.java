import java.util.InputMismatchException;
import java.util.Scanner;

public class testSpeedConvertor {
    public static long toMilesPerHour(double kilometersPerHour){
//        long miles;
        if(kilometersPerHour < 0){
            return -1;
        }
//        else {
            return Math.round(kilometersPerHour / 1.609);
//            return  miles;
//            }

    }
   public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
   }

    public static void main(String[] args) {
                boolean executeTillEnd=false;
                while(!executeTillEnd){
                    Scanner kilometers=new Scanner(System.in);
                    try{
                        System.out.print("Enter the Kilometer value: ");
                        double kiloM=kilometers.nextDouble();
                        System.out.print("Entered Kilometers in Miles is " + toMilesPerHour(kiloM));
                        System.out.print("\n");
                        printConversion(kiloM);
                        toMilesPerHour(kiloM);
                        System.out.print("\n");
                       // executeTillEnd=true;
                    }
                    catch(InputMismatchException ashwin){
                        kilometers.next();
                        System.out.print("Please enter a numeric value for kilometer");
                        System.out.print("\n");
                    }
                }
    }
}
