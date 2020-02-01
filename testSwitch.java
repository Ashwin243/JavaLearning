import java.util.Scanner;

public class testSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        //char a = input.next().charAt(0);
        String b=input.nextLine();
        //char a='B';
        switch (b.toUpperCase()) {
            case "A": case "B": case "C": case "D": case "E":
                System.out.println(b);
                break;
            default:
                System.out.println("None of the listed values entered");
        }

    }
}
