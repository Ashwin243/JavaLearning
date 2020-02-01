public class testMinsAndSeconds2 {
    public static String getDurationString(int min,int seconds) {
        if (min < 0 || seconds < 0 || seconds >59) {
            return "Invalid Value";
        } else {
            long hours = min / 60;
            long remainingmins = min % 60;
            String hrs = String.format("%02d", hours);
            String mins = String.format("%02d", remainingmins);
            String secs = String.format("%02d", seconds);
            String duration = hrs + "h " + mins + "m " + secs + "s";
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
    public static void main(String[] args) {
        String  a=getDurationString(1240,56);
        String b=getDurationString(100);
        System.out.println(a);
        System.out.println(b);
    }
}

