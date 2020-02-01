import java.util.Scanner;

public class generateTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number for which multiplication table has to be generated: ");
        int num = input.nextInt();
        int i;
        for (i = 1; i <=10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

}
