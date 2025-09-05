import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
    public HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public boolean addContact(String name, String phoneNo) {
        if (phoneBook.containsKey(name)) {
            return false;
        } else {
            phoneBook.put(name, phoneNo);
            return true;
        }
    }

    public String searchContact(String name) {
        if (!phoneBook.containsKey(name)) {
            return null;
        } else {
            return phoneBook.get(name);
        }
    }

    public boolean deleteContact(String name) {
        if (!phoneBook.containsKey(name)) {
            return false;
        } else {
            phoneBook.remove(name);
            return true;
        }
    }

    public void displayAllContacts() {
        System.out.println("------Phone Book------");
        if (phoneBook.isEmpty()) {
            System.out.println("No contacts");
        }
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------");
    }
}

public class PhoneBookApplication {
    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "\nEnter your operation: \n1. Add contact \n2. Search Contact \n3. Delete Contact \n4. Display all contact \n5. Exit");
            int operation = sc.nextInt();
            switch (operation) {
                case 1: {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone no: ");
                    String phoneNo = sc.next();

                    if (!p.addContact(name, phoneNo)) {
                        System.out.println("Could not add the contact with name " + name);
                    } else {
                        System.out.println(name + "'s Contact added");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    String res = p.searchContact(name);

                    if (res == null) {
                        System.out.println("No contacts found with the name " + name);
                    } else {
                        System.out.println(name + ": " + res);
                    }
                    break;
                }
                case 3:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    if (!p.deleteContact(name)) {
                        System.out.println("Could not delete the contact");
                    } else {
                        System.out.println(name + " contact deleted");
                    }
                    break;

                case 4:
                    p.displayAllContacts();
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
}
