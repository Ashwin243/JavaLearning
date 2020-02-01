import java.util.InputMismatchException;
import java.util.Scanner;

public class testKBtoMB {
    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(KiloBytes + " KB = " + (KiloBytes / 1024) + " MB and " + (KiloBytes % 1024) + " KB");
        }
    }


    public static void main(String[] args) {
        boolean executeTillTheEnd = false;
        Scanner KB = new Scanner(System.in);
        while (!executeTillTheEnd) {
            try {
                System.out.print(" Enter the KiloBytes: ");
                int kilobytes = KB.nextInt();
                System.out.print(" Entered KB's " + kilobytes + " is ");
                printMegaBytesAndKiloBytes(kilobytes);
//           printMegaBytesAndKiloBytes(2500);
                //         printMegaBytesAndKiloBytes(-1024);
                //       printMegaBytesAndKiloBytes(5000);
                executeTillTheEnd = true;
            } catch (InputMismatchException ashwin) {
                KB.next();
                System.out.println("Entered KB's is not a valid data");
                System.out.print("Please re-enter a valid number for KB");
                System.out.println("\n");
            }

        }
    }
}
