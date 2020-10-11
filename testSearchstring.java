import java.util.Scanner;

public class testSearchstring {
    private String sourceString;
    private String searchString;

    public testSearchstring(String searchString, String sourceString) {
        this.searchString = searchString;
        this.sourceString = sourceString;
    }

    public static double findFirstMatch(String searchString, String sourceString) {
        int length = searchString.length();
        for (int index = 0; index < sourceString.length(); index++) {
            String possibleMatch = sourceString.substring(index,index+length);
            //sourceString.sub
            if (possibleMatch == (searchString)) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sourceString_input = new Scanner(System.in);
        System.out.println("Please enter the source string: ");
        String sourceString  = sourceString_input.nextLine();
        Scanner searchString_input = new Scanner(System.in);
        System.out.println("Please enter the search string: ");
        String searchString  = searchString_input.nextLine();
        double ans = findFirstMatch(searchString,sourceString);
       // String test = sourceString.substring(3,4);
        //int ans = sourceString.indexOf(searchString);
        System.out.println(ans);
        //System.out.println("Index found at " + findFirstMatch(searchString,sourceString) + " position");

        }

    }
