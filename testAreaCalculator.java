public class testAreaCalculator {
    private static final double  INVALID_ARGUMENT=-1;
    public static double area(double radius){
        if(radius<0){
            return INVALID_ARGUMENT;
        }
        else{
            return Math.PI*radius*radius;
        }
    }
    public static double area(double x,double y){
        if(x<0||y<0){
            return INVALID_ARGUMENT;
        }
        else{
            return x*y;
        }
    }
    public static void main(String[] args) {
        double circle=area(5.0);
        System.out.println(circle);
        circle=area(5.0,4.0);
        System.out.println(circle);

    }
}
