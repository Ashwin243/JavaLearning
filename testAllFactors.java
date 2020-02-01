public class testAllFactors {
    public static void printFactors(int num){
        int i = 1;
        if(num<1){
            System.out.println("Invalid Value");
        }
        for(i=1;i<=num;i++){
            if((num%i==0)){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        printFactors(50);
    }
}
