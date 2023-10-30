
package insertionsortaddressbook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class InsertionSortAddressBook {
class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    @Override
    public String toString() {
        return name + ": " + phoneNumber;
    }
}

public class AddressBook {
    private List<Contact> contacts;
    
    public AddressBook() {
        contacts = new ArrayList<>();
    }
    
    public void addContact(Contact contact) {
        contacts.add(contact);
        sortContactsByName();
    }
    
    public void displayContacts() {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    
    private void sortContactsByName() {
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });
    }
    
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Address Book Application");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add contact");
            System.out.println("2. Display contacts");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

