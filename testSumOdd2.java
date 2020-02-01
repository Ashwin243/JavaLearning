public class testSumOdd2 {
    public static boolean isOdd(int number){
        return (number>0 && (number%2!=0));
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if(start>0&&end>0&&end>=start){
            if(!isOdd(start)){
                start++;
            }
            for(int i=start;i<=end;i+=2){
                    sum+=i;
            }
            return sum;
        }
        return -1;
    }
    public static void main(String[] args) {
        // boolean a=isOdd(59);
        //System.out.println(a);
        long a=sumOdd(10,5);
        System.out.println(a);
    }
}
