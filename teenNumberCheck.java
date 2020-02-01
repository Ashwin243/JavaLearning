public class teenNumberCheck {
    public static boolean hasTeen(int num1, int num2, int num3) {
        /* Commented part of the code was written assuming that if more than one teen is present method
        * should return false*/
        //      if(((num1>=13&&num1<=19) && (num2>=13&&num2<=19)) || ((num2>=13&&num2<=19) && (num3>=13&&num3<=19)) ||
        //              ((num1>=13&&num1<=19) && (num2>=13&&num2<=19))){
        //         return false;
        //      }
        //    else if((num1>=13&&num1<=19) || (num2>=13&&num2<=19) || (num3>=13&&num3<=19)){
        return ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
    }
    //       return false;
    //   }

    public static boolean isTeen(int num1) {
        return (num1 >= 13 && num1 <= 19);
    }

    public static void main(String[] args) {
        boolean test = hasTeen(13, 14, 15);
        System.out.println(test);
        boolean test2 = isTeen(23);
        System.out.println(test2);

    }
}
