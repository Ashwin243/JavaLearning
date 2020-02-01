import java.util.Scanner;

public class testtable {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N>=2 && N<=20){
        for(int i=1;i<=10;i++){
            System.out.println(N + " x " + i + " = " +(N*i));
        }
        }
        else{
            System.out.println(" Number should be between 2 and 20");
        }
        scanner.close();
    }
}


