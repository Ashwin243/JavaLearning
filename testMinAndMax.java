import java.util.Scanner;
public class testMinAndMax {
    public static void main(String[] args) {
        int min=0,max=0;
        Scanner scanner=new Scanner(System.in);
        int counter=0;
        while(true){
            System.out.print("Enter the Number: ");
            boolean isInt=scanner.hasNextInt();
            if(isInt){
            int a=scanner.nextInt();
                if(counter==0)
                {
                      min=a;
                      counter++;
                }
            if(a>max) max=a;
            if(a<min) min=a;
            }
            else {
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();
        }
        if(counter==0){
            System.out.println("No Valid numbers were input");
        }
        else{
        System.out.println("Maximum Number among the entered numbers = " +max);
        System.out.println("Minimum Number among the entered numbers = " +min);
        }
    }
}
