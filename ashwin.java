public class ashwin {

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0 || (inches<0 || inches>12))
        {
            System.out.println("Invalid Inches or feet parameters");
            return -1.0;
        }

        double cmt=feet*12*2.54;
        cmt+=inches*2.54;
        //return cm;
        System.out.println(feet +" feet, " +inches+ " inches = " +cmt+ " cms" );
        return cmt;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            //System.out.println("Entered inches in Cms is : " +inches*2.54 + " Cms");
            //System.out.println("Entered inches in feet is : " +inches/12 + " feet");
            System.out.println("WTF");
            return -1;
        }
        else{
            double feet=inches/12;
            return feet;
        }
    }

    public static void main(String[] args) {
        double abs=calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(1),10);
        System.out.println(abs);
    }
}

