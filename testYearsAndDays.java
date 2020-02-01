public class testYearsAndDays {
//    public static void printYearsAndDays(long mins)
//    {
//        if(mins<0){
//            System.out.println("Invalid Value");
//        }
//        else{
//            System.out.println(mins + " min = "+mins/(365*24*60)+" y and "+(mins/(24*60)%365)+" d");
//        }
//    }

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long minutesToDays = minutes / (60 * 24);
            long daysRemainderYears = minutesToDays % 365;
            long totalYears = minutesToDays / 365;

            System.out.println(minutes + " min = " + totalYears + " y and " + daysRemainderYears + " d");
        }
    }


    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
