public class testMinsAndSeconds3 {
    public static String getDurationString(int min,int seconds) {
        if (min < 0 || seconds < 0) {
            return "Invalid Value";
        } else {
            String duration = appendZero(min/60) + "h " + appendZero(min%60) + "m " + appendZero(seconds) + "s";
            return duration;
        }

    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid value";
        }
        else{
            return getDurationString(seconds/60,seconds%60);
        }
    }
    public static String appendZero(int time)
    {if(time<10){
        return "0"+time;
        }
    else{
        return ""+time;
        }
    }
    public static void main(String[] args) {
        String  a=getDurationString(61,78);
        String b=getDurationString(-9);
        System.out.println(a);
        System.out.println(b);
    }
}
