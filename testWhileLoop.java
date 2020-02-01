public class testWhileLoop {
    public static void main(String[] args) {
        int num=4,end=20,count=0;
        while(num<=end){
            num++;
            if(num%2!=0){
                continue;
            }
            System.out.println("Even number = " +num);
            count++;
            if(count==5)break;
        }
        System.out.println("number of even numbers found = " +count);
    }
}
