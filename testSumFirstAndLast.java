public class testSumFirstAndLast {
    public static int SumFirstAndLastDigit(int num){
        int last=0,first=0,rem=0;
        int loopnum=num;
        if(num<0){
            return -1;
        }
        if(num>0 && num <10){
            return 2*num;
        }
        while(loopnum!=0){
            //rem=loopnum%10;
            loopnum/=10;
            if(loopnum<10){
              first=loopnum;
              break;
            }
        }
        last=num%10;
        return (first+last);
    }
    public static void main(String[] args) {
             int a=SumFirstAndLastDigit(9009);
        System.out.println(a);
    }
}
