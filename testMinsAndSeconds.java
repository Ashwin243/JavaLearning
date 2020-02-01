public class testMinsAndSeconds {
    public static String getDurationString(int min,int seconds) {
        if (min < 0 || seconds < 0 || seconds >59) {
            return "Invalid Value";
        } else {
            long hours = min / 60;
            long remainingmins = min % 60;
            if (hours > 10 && remainingmins > 10 && seconds > 10) {
                return hours + "h " + remainingmins + "m " + seconds + "s";
            } else if (hours < 10 && remainingmins > 10 && seconds > 10) {
                return "0" + hours + "h " + remainingmins + "m " + seconds + "s";
            } else if (hours > 10 && remainingmins < 10 && seconds > 10) {
                return hours + "h 0" + remainingmins + "m " + seconds + "s";
            } else if (hours > 10 && remainingmins > 10 && seconds < 10) {
                return hours + "h " + remainingmins + "m 0" + seconds + "s";
            } else if (hours < 10 && remainingmins < 10 && seconds < 10) {
                return "0" + hours + "h 0" + remainingmins + "m 0" + seconds + "s";
            } else if (hours < 10 && remainingmins < 10 && seconds > 10) {
                return "0" + hours + "h 0" + remainingmins + "m " + seconds + "s";
            } else if (hours > 10 && remainingmins < 10 && seconds < 10) {
                return hours + "h 0" + remainingmins + "m 0" + seconds + "s";
            } else {
                return "0" + hours + "h " + remainingmins + "m 0" + seconds + "s";
            }


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
        String  a=getDurationString(61,56);
        String b=getDurationString(100);
        System.out.println(a);
        System.out.println(b);
    }
}
