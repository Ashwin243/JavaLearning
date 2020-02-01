public class testSumMethodOverloading {

    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return sum(a,b)+c;
    }
    public static int sum(int a,int b,int c,int d){
        return sum(a,b,c)+d;
    }
    public static void main(String[] args) {
      int a= sum(1,2,3,4);
        System.out.println(a);
    }
}
