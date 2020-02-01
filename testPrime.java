import java.util.Scanner;

public class testPrime {
    public static boolean isPrime(int num){
        boolean prime=true;
        if( num < 2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if((num % i ==0)){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        System.out.print("Please enter the number to check if it's prime or not: ");
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        boolean a=isPrime(num);
        System.out.println("Number "+num+ " is a Prime : " +a);

    }
}