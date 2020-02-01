public class testSumDigit {
    public static int sumDigit(int num){
        int rem = 0, sum = 0;
       if(num>=10) {
           while (num > 0) {
               rem = num % 10;
               sum += rem;
               num /=10;
           }
           return sum;
       }
       return -1;
       //return -1;
    }
    public static void main(String[] args) {
        int sum=sumDigit(24311);
        System.out.println(sum);

    }
}
