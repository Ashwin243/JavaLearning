public class testGreatestPrimeFactor2 {
    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) number = i;
        }
        return number;
    }

    public static void main(String[] args) {
        int aa=getLargestPrime(45);
        System.out.println(aa);
    }
}

