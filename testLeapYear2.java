public class testLeapYear2 {
    public static boolean isLeapYear(int year) {
        return ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }





        public static void main (String[]args){
            boolean a = isLeapYear(0);
            System.out.println(a);
            //int a=getDaysInMonth(12,10000);
            //.out.println(a);

        }
    }


