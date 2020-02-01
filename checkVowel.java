import java.util.Scanner;

public class checkVowel
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an alphabet to check for vowel or Consonant: ");
            String alphabet = input.nextLine();
            //char alphabet = input.next().charAt(0);
            int inputlength = alphabet.length();
            //System.out.println("The name " + alphabet + " contains " + inputlength + " letters");
            if (inputlength > 1)
            {
                System.out.println("Entered input " + alphabet + " is not a single alphabet, it's more than one alphabet");
            }
            else if(inputlength ==1)
                {

                if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u") || alphabet.equals("A") ||
                        alphabet.equals("E") || alphabet.equals("I") || alphabet.equals("O") || alphabet.equals("U"))
                     {
                    System.out.println("Entered Alphabet " + alphabet + " is an vowel");
                     }
                else {
                    //if ((alphabet[0]>= 'a' && alphabet[0] <= "z") || (alphabet[0] >= 'A' && alphabet[0] <= 'Z'))
                       // System.out.println("Entered Alphabet " + alphabet + " is a consonant");
                    //else
                        System.out.println("Input is not an alphabet,Please enter an alphabet to check");
                     }
                }
            else
                {
                System.out.println("Please enter something to check");
                }
        }
    }

