import java.util.Scanner;

public class testSum3and5 {
    public static void main(String[] args) {
        int i;
        int count=0,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        for(i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                //int count,sum=0
                System.out.println("Number divisible by 3 and 5 @ position " +String.format("%02d",(count+1))+ " = " +i);
                count++;
                sum+=i;
                if(count==10){
                    System.out.println("SUM = " +sum);
                    break;
                }
            }
        }
    }
}
