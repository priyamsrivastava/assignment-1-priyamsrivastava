package dataAndManipulation;

import myLinkedList.MyLinkedListDefinitionClass;
import person.Person;

import java.util.Scanner;

public class DataInputAndManipulation {
    Scanner scanner = new Scanner(System.in);

    public Person insert() {


        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Contact Number: ");
        long contactNumber = Long.parseLong(scanner.nextLine());

        MyLinkedListDefinitionClass<Long> contactNumberList = new MyLinkedListDefinitionClass<>();
        contactNumberList.add(contactNumber);

        System.out.println("Would you like to add another contact number? (y/n): ");
        char ch = scanner.nextLine().charAt(0);
        char ch3 = 'a';

        while (ch != 'n' && ch3 != 'n') {
            System.out.println("Enter the contact number again: ");
            contactNumberList.add(Long.parseLong(scanner.nextLine()));
            System.out.println("Would you like to add another contact number? (y/n): ");
            ch3 = scanner.nextLine().charAt(0);

        }
        System.out.println("Enter the Email Address: ");
        String emailAddress = scanner.nextLine();
        return new Person(firstName, lastName, emailAddress, contactNumberList);
    }

    public void printContactDetails(MyLinkedListDefinitionClass<Person> list) {
        System.out.println("---Here are all your contacts---");
        for (int i = 0; i < list.getSize(); i++) {
            Person myNode = list.getNode(i).getData();
            showContactDetails(myNode);
        }
    }

    public void search(String firstName, MyLinkedListDefinitionClass<Person> list) {
        int counter = 0;

        for (int i = 0; i < list.getSize(); i++) {
            Person myNode = list.getNode(i).getData();
            if (myNode.getFirstName().compareToIgnoreCase(firstName) == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("NO RESULTS FOUND!");
        } else {
            System.out.println(counter + " match found!");
        }
        for (int i = 0; i < list.getSize(); i++) {
            Person myNode = list.getNode(i).getData();
            if (myNode.getFirstName().compareToIgnoreCase(firstName) == 0) {
                showContactDetails(myNode);
            }
        }
    }

    private void showContactDetails(Person myNode) {
        System.out.println("-------- * -------- * -------- * --------\n" + "First Name:" +
                myNode.getFirstName() + "\n"
                + "Last Name: " + myNode.getLastName());

        if (myNode.getContactNumber().getSize() == 1) {
            System.out.println("Contact Number: " + myNode.getContactNumber().getNode(0).getData());
        } else {
            System.out.print("Contact Number(s): ");
            for (int z = 0; z < myNode.getContactNumber().getSize(); z++) {
                System.out.print(myNode.getContactNumber().getNode(z).getData() + (myNode.getContactNumber().getSize() - 1 > z ? "," : "\n"));
            }
        }
        System.out.println("Email Address: " + myNode.getEmailAddress() + "\n" +
                "-------- * -------- * -------- * -------");
    }


    public void delete(MyLinkedListDefinitionClass<Person> list) {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < list.getSize(); i++) {
            Person name = list.getNode(i).getData();
            System.out.println((i + 1) + ". " + name.getFirstName() + " " + name.getLastName());
        }
        System.out.print("Press the number against the contact to delete it: ");
        int choice = scanner.nextInt();
        Person name = list.getNode(choice - 1).getData();
        System.out.println(name.getFirstName() + " " + name.getLastName() + "s contact deleted from list!");
        list.remove(choice - 1);
    }
}
