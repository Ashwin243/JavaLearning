public class testForLoop {
    //    public static double interestCalculator(double amount,double interest){
//        return (amount*interest/100);
//    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < (long)Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        double i;
//        for(i=2;i<9;i++){
//            System.out.println("Interest Amount for 10000 at " + i + "% = " +interestCalculator(10000,i));
//        }
//         //double a=interestCalculator(10000,2);
//        //System.out.println(a);
        int count = 0;
        //while(j<4){
        for (int i = 1; i < 10; i++) {
            //while (j < 4) {
                if (isPrime(i)) {
                    System.out.println("Prime number is " + i);
                    count++;
                    if(count==3){
                        break;
                    }
                }
            }
        }
    }

