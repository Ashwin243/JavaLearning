// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " already exists, If you want to update press option 3 " );
            return false;
        }
        if(findContactWithNumber(contact.getPhoneNumber()) >=0) {
            String name = queryContactWithNumber(contact.getPhoneNumber());
            System.out.println(contact.getPhoneNumber() + " already exists for " + name + ", If you want to update press option 3 " );
            return false;
        }
        this.myContacts.add(contact);
        System.out.println("New contact for " + contact.getName() + " with number " + contact.getPhoneNumber() + " is successfully added");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact.getName());
        if( foundPosition < 0) {
            System.out.println(oldContact.getName() + " not found in the phone directory");
            return false;
        }
        //if(foundPosition )
        if(findContactWithNumber(newContact.getPhoneNumber()) >= 0){
            System.out.println("This number " + newContact.getPhoneNumber() + " already exists, Please update a different one.");
            return false;
        }
        if(findContact(newContact.getName()) == findContactWithNumber(newContact.getPhoneNumber())) {
            System.out.println("Exact same contact already exists");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " with phone number " + oldContact.getPhoneNumber() + " has been replaced" +
                " with " + newContact.getName() + " with phone number " + newContact.getPhoneNumber());
        return true;
    }
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i < this.myContacts.size();i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContactWithNumber(String number){
        for(int i=0;i<this.myContacts.size();i++) {
            Contact contact = myContacts.get(i);
            if(contact.getPhoneNumber().equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
          return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int foundPosition = findContact(name);
        if(foundPosition >= 0) {
                return this.myContacts.get(foundPosition);
            }
        return null;
    }

    public String queryContactWithNumber(String phoneNumber) {
        int foundPosition = findContactWithNumber(phoneNumber);
        if(findContactWithNumber(phoneNumber) >= 0) {
            return this.myContacts.get(foundPosition).getName();
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getName() + " is not found in the directory , Hence unable to delete the contact.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " has been deleted from the contact list.");
        return true;
    }

    public void printContacts() {
        System.out.println("There are " + this.myContacts.size() + " contacts in the contact list , They are \n");
        for(int i=0;i<this.myContacts.size();i++) {
            System.out.println((i+1) + " . " + this.myContacts.get(i).getName() + " --> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
