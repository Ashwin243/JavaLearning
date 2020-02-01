public class testYearsAndDays2 {
        public static void printYearsAndDays(long mins)
        {
            if(mins<0){
                System.out.println("Invalid Value");
            }
            else{
                //long hours=mins/60;
                //long days=hours/24;
                //long years=days/365;
                //long remainingdays=days%365;
                System.out.println(mins + " min = "+mins/(365*24*60)+"y:"+(mins/(24*60)%365)+"d:"+(mins/60)%24+"h:"+mins%60+"m");
            }
        }
        public static String appendZero(long no){
            if(no<10){
                return "0"+no;
            }
            else{
                return ""+no;
            }


        }

        public static void main(String[] args) {
            printYearsAndDays(561600);
        }
    }

