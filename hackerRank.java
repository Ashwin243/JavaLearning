import java.util.Scanner;
public class hackerRank {
    static boolean isAnagram(String a, String b) {
            // Complete the function
            boolean anagram = true;
            int compareCount = 0;
            int sameCount = 0;
            if(a.length() != b.length()) {
                //System.out.println("Not Anagrams");
                return false;
            }
            else {
                for(int i=0;i<a.length();i++) {
                    for(int j=0;j<b.length();j++) {
                        if(Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(a.charAt(j))) {
                            sameCount ++;
                        }
                        if(Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(b.charAt(j))) {
                            sameCount --;
                        }
                    }
                }
                System.out.println("value of Same count = " + sameCount);
                //System.out.println("value of compare count = " +compareCount);
                if(sameCount != 0){
                    //System.out.println("Not Anagrams");
                    return false;
                }
                //System.out.println("Anagrams");
                return true;
            }
        }
//
//        public static boolean isPrime(int a) {
//         (isProbablePrime(a) == true) {
//
//         }
//        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
//    String smallest = s.substring(0,k);
//    String largest  = "";
//for(int i=0;i<s.length()-k+1;i++){
//        if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
//        if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
//    }



    }

