public class testEvenDigitSum {
    public static int getEvenDigitSum(int num) {
        int sum = 0;
        if (num < 0) {
            return -1;
        }
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                sum = sum + (num % 10);
            }
                num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = getEvenDigitSum(252098);
        System.out.println(a);
    }
}
