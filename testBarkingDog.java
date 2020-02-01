public class testBarkingDog {
    public static boolean shouldWakeup(boolean barking,int hourOfDay){
        if((hourOfDay < 0) || (hourOfDay > 23)){
            return false;
        }
        else if((barking) && ((hourOfDay<8) || (hourOfDay >22))){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        boolean test;
        test=shouldWakeup(true,1);
        System.out.println(test);
        test= shouldWakeup(false,2);
        System.out.println(test);
        test=shouldWakeup(true,8);
        System.out.println(test);
        test=shouldWakeup(true,23);
        System.out.println(test);
    }
}
