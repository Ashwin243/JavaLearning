import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dev on 23/08/15.
 */


public class GroceryList_test {
    private static ArrayList<String> groceryList = new ArrayList<String>();
    private static Scanner number = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = addListItems(5);
        System.out.println("Enter the string to be searched in the Array List : ");
        String search = number.next();
        boolean a = containsIgnoreCase(search,list);
        System.out.println("Entered String is present in the Array List : " + a);
    }

    public static void addGroceryItem(String item) {
        groceryList.add(item);
    }


    public static void testMethod(String item) {
        System.out.println("Test method was called, Enjoy the evening");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public static boolean containsIgnoreCase(String searchItem,ArrayList<String> list){
        //return groceryList.contains(searchItem);
       // return groceryList.stream().anyMatch(searchItem::equalsIgnoreCase);
        //return groceryList.stream().filter(s -> s.equalsIgnoreCase(searchItem).findFirst().);
        for(String a : list){
            if (a.equalsIgnoreCase(searchItem)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> addListItems(int num){
        System.out.println("Enter " + num + " Array values : \r");
        ArrayList<String> itemList = new ArrayList<>(num);
        while(itemList.size() < num){
            itemList.add(number.next());
        }
        return itemList;
    }

    public static String findItem(String searchItem) {
       // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0 ) {
            return groceryList.get(position);
        }
        else {
            return "Checked item is not present in the list";
        }
    }
}

