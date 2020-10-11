import java.util.ArrayList;
import java.util.Random;

public class TestAutoAndUnboxing {
    public static void main(String[] args) {
        String [] strArray = new String[10];
        int[] intArray = new int[20];

        ArrayList<String> strArrayList = new ArrayList<String>();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i=0;i<7;i++){
            strArrayList.add(generateRandomString());
        }

        // Autoboxing example for Int array list
        for(int i=0;i<10;i++){
            Random number = new Random();
           // intArrayList.add(Integer.valueOf(i));
            intArrayList.add(number.ints(1,1000).findFirst().getAsInt());
        }

        // Unboxing example of Int array list
        for (int i=0;i<intArrayList.size();i++){
            Random number = new Random();
           System.out.println("Int Array list element " + i + " ---> " + intArrayList.get(i).intValue());
            //System.out.println("Int Array list element " + i + " ---> " + number.ints(1,100).findFirst().getAsInt());
        }
        //printArrayList(intArrayList);
      //printArrayList(strArrayList);

    }
    public static String generateRandomString() {
    // create a string of all characters
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string
    int length = 7;

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphabet.length());

      // get character specified by index
      // from the string
      char randomChar = alphabet.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    //System.out.println("Random String is: " + randomString);
        return randomString;
    }

    public static void printArrayList(ArrayList dummy){
        for(int i=0;i<dummy.size();i++){
            System.out.println(" Random Array list element " + (i+1) + " is " + dummy.get(i));
        }
        //return dummy;
    }
}
