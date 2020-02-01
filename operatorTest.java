public class operatorTest {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + getResult(result));
        result = getResult(result) - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + getResult(result));
       // System.out.println("previousResult =  " + previousResult);

        result = getResult(result) * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + getResult(result));

        result = getResult(result) / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + getResult(result));

        result = getResult(result) % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + getResult(result));
        int previousResult = getResult(result);
        System.out.println("previousResult =  " + getResult(previousResult));

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + getResult(result));

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + getResult(result));

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + getResult(result));

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + getResult(result));

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + getResult(result));

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + getResult(result));

        boolean isAlien=true;
        if(isAlien)
            System.out.println("This is an Alien,Yaay!!!");
        else
            System.out.println("This is not an Alien:(");



        }

    private static int getResult(int result)
    {
        return result;
    }
}

