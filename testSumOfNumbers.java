import java.util.Scanner;

public class testSumOfNumbers {
    public static void main(String[] args) {
        int sum=0,count=0;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("Enter the number #" +(count+1)+ ": ");
            boolean hasInt=scanner.hasNextInt();
            //scanner.nextLine();
            if(hasInt) {
                int num = scanner.nextInt();
                sum += num;
                count++;
                if(count==10)break;
            }
            else{
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Number of Valid Numbers entered : " +count);
        System.out.println("Sum = " +sum);
    }
}
