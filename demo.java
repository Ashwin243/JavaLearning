import java.util.Scanner;
public class demo
{
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("enter the name:");
        String name = sc.nextLine();
        // Character input
        System.out.print("Enter the gender: ");
        char gender = sc.next().charAt(0);


        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the mobile number: ");
        long mobileNo = sc.nextLong();
        System.out.print("Enter the CGPA: ");
        double cgpa = sc.nextDouble();

        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}
