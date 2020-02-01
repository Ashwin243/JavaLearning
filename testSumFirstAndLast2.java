public class testSumFirstAndLast2 {
    public static int sumFirstAndLastDigit(int num){
        if(num<0){
            return -1;
        }
        int last=num%10;
        while(num>9){
            num/=10;
        }
        return last+num;
    }
    public static void main(String[] args) {
        int a=sumFirstAndLastDigit(1);
        System.out.println(a);
    }
}
