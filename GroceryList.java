
import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
       // System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void modifyGroceryItem(String oldItem,String newItem) {
        int position = findItem(oldItem);
        if(position != -1) {
            modifyGroceryItem(position,newItem);
            System.out.println("Grocery item at " + (position + 1) + " has been modified from " + oldItem + " to " + newItem);
        }
        else {
            System.out.println("Grocery item " + oldItem + " is not found in the list");
        }
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
       // System.out.println("Position is " +position);
        groceryList.remove(position);
    }

//    public void removeGroceryItem(String itemName) {
//        int position = findItem(itemName);
//        String theItem = groceryList.get(position);
//        groceryList.remove(position);
//    }

    public void removeGroceryItem(String searchItem) {
        int position = findItem(searchItem);
        //System.out.println("Position is " +position);
        if(position != -1) {
           removeGroceryItem(position);
        }
        else {
            System.out.println("Requested item " + searchItem + " is not present in the list to remove");
        }
    }

    public String findItem(String searchItem, GroceryList list) {
//        boolean exists = groceryList.contains(searchItem);

//        int position = groceryList.indexOf(searchItem);
//        if(position >=0) {
//            return groceryList.get(position);
//        }
//        return null;
//        TODO(Ashwin) : Figure out how to do case insensitive item query
        boolean exists = false;
        for(String a : groceryList) {
            if (a.equalsIgnoreCase(searchItem)) {
                exists = true;
                int position = groceryList.indexOf(a);
            }
        }
        if(exists) {
            return "Found the item";
        }
        return null;
    }

    public int findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

//        int position = groceryList.indexOf(searchItem);
//        if(position >=0) {
//            return groceryList.get(position);
//        }
//        return null;
//        TODO(Ashwin) : Figure out how to do case insensitive item query
        boolean exists = false;
        int position = -1;
        for(String a : groceryList) {
            if (a.equalsIgnoreCase(searchItem)) {
                exists = true;
                 position = groceryList.indexOf(a);
            }
        }
       return position;
    }
}

