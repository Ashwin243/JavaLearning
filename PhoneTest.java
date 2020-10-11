import java.util.Scanner;

public class PhoneTest {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9686243723");
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        System.out.println("Starting phone: " );
        printActions();
        while(!quit) {
            System.out.println("Enter the option number : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Shutting down the phone, Bye Bye!");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Printing the contact list");
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }


    public static void printActions() {
        System.out.println("\nAvailable actions : \n Press ");
        System.out.println("\t 0 - Shutdown phone.");
        System.out.println("\t 1 - To print contact list.");
        System.out.println("\t 2 - To add a new contact to the list.");
        System.out.println("\t 3 - To update the contact in the list.");
        System.out.println("\t 4 - To remove an existing contact from the list.");
        System.out.println("\t 5 - To search if an contact exists in the list.");
        System.out.println("\t 6 - To print list of available options.");
    }

    public static void selectOptions() {
        System.out.println("\nAvailable actions : \n Press ");
        System.out.println("\t 1 - Enter name.");
        System.out.println("\t 2 - Enter number.");
    }


    private static void addContact() {
        System.out.println("Enter the new contact name to be added");
        String name = scanner.nextLine();
        System.out.println("Enter phone number for " +name);
        String num = scanner.nextLine();
//        Contact newContact = new Contact(name,num);
//        mobilePhone.addNewContact(newContact);
        Contact newContact = Contact.createContact(name,num);
        mobilePhone.addNewContact(newContact);
    }

    private static void updateContact() {
//        selectOptions();
//        boolean quit = false;
//        int choice = 1;
//        while(!quit) {
//            System.out.println("Enter the option number : ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch(choice) {
//                case 1:
//
//            }
//            }
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        Contact oldContactName = mobilePhone.queryContact(name);
        //String nameFromNumber = mobilePhone.queryContactWithNumber(name);
       // Contact oldContactNumber = mobilePhone.queryContact(name);

        if(oldContactName == null) {
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
       if(mobilePhone.updateContact(oldContactName,newContact)) {
           System.out.println("Successfully updated");
       }
       else {
           System.out.println("Contact not found or trying to insert duplicate contact");
       }
    }

    private static void removeContact() {
        System.out.println("Enter contact name to be deleted ");
        String name = scanner.nextLine();
        Contact contactToBeDeleted = mobilePhone.queryContact(name);
        if(contactToBeDeleted == null) {
            System.out.println("Contact not found");
        }
        if(mobilePhone.removeContact(contactToBeDeleted)) {
            System.out.println("Successfully deleted the contact");
        }
        else {
            System.out.println("Error deleting the contact, contact not found");
        }
    }

    private static void searchContact() {
        System.out.println("Enter contact name to be searched ");
        String name = scanner.nextLine();
        Contact foundContact = mobilePhone.queryContact(name);
        if(foundContact == null) {
            System.out.println("Error, contact with " +name+ " doesn't exist");
        }
        else {
            System.out.println("Contact found, Number for " + name + " is " + foundContact.getPhoneNumber());
        }

    }

}

