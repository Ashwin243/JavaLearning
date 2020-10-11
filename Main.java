import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    testVehicleMethod();
                    break;
                case 8:
                    ArrayList<Integer> test = generateIntArray();
                    printIntArray(test);
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item/items in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
        System.out.println("\t 7 - Test vehicle.");
        System.out.println("\t 8 - Test random Integer Arraylist.");
    }

    public static void addItem() {
        boolean breakFromLoop = false;
        System.out.println("Enter number of items to be added to the list ");
        System.out.println("Note : You can add up to 5 items a time to the list ");
        int num = scanner.nextInt();
        if (num > 7) {
            System.out.println("You can enter only 5 items at a time");
        }
        while (num <= 5 && !breakFromLoop) {
            for (int i = 0; i < num; i++) {
                switch (i) {
                    case 0:
                        System.out.print("Please enter the first grocery item : ");
                        groceryList.addGroceryItem(scanner.next());
                        break;
                    case 1:
                        System.out.print("Please enter the second grocery item : ");
                        groceryList.addGroceryItem(scanner.next());
                        break;
                    case 2:
                        System.out.print("Please enter the third grocery item : ");
                        groceryList.addGroceryItem(scanner.next());
                        break;
                    case 3:
                        System.out.print("Please enter the fourth grocery item : ");
                        groceryList.addGroceryItem(scanner.next());
                        break;
                    case 4:
                        System.out.print("Please enter the fifth grocery item : ");
                        groceryList.addGroceryItem(scanner.next());
                        break;
                }
            }
            breakFromLoop = true;
        }
    }

    public static void modifyItem() {
//        System.out.print("Enter item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
                System.out.print("Enter item to be replaced: ");
        String oldItem = scanner.nextLine();
        int num = groceryList.findItem(oldItem);
        if(num == -1) {
            System.out.println("Entered item " + oldItem + " is not present in the list");
        }
        else {
            System.out.print("Enter replacement item: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryItem(oldItem, newItem);
        }
    }

    public static void removeItem() {
        System.out.print("Enter item to be removed : ");
        String itemName = scanner.nextLine();
        //scanner.nextLine();
        groceryList.removeGroceryItem(itemName);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
//        if(groceryList.findItem(searchItem,groceryList) != null) {
//            System.out.println("Found " + searchItem + " in  our grocery list");
//        } else {
//            System.out.println(searchItem + " is not in the shopping list");
//        }
        if(groceryList.findItem(searchItem) != -1) {
            System.out.println(searchItem + " is present in shopping list and is at position " + (groceryList.findItem(searchItem)+1));
        }
        else {
            System.out.println(searchItem + " is not in the shopping list");
       }
    }

    public static void testVehicleMethod() {
        vehicle testVehicle = new vehicle();
        System.out.println(testVehicle.getName() + " is the name of the vehicle with size " + testVehicle.getSize());
    }

    public static ArrayList generateIntArray(){
        ArrayList<Integer> testArrayIntList = new ArrayList<Integer>();
        System.out.println("Enter the minimum number in the range");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum number in the range");
        int max = scanner.nextInt();
        System.out.println("Enter the number of random numbers to be printed");
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            Random random = new Random();
            //System.out.println("Random number is " + number);
            testArrayIntList.add(random.ints(min, max)
                    .findFirst()
                    .getAsInt());
        }
//        for(int i=min;i<max;i=i+3){
//            testArrayIntList.add(i);
//        }
        return testArrayIntList;
    }


    public static void printIntArray(ArrayList<Integer> intarray){
        System.out.print("Array is : {");
        for (int i=0;i<intarray.size();i++) {
            if(i == (intarray.size() -1 )) {
                System.out.print(intarray.get(i));
            }
            else {
                System.out.print(intarray.get(i) + ",");
            }
        }
        System.out.println("}");
    }


}























