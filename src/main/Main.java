package main;

import dataAndManipulation.DataInputAndManipulation;
import myLinkedList.MyLinkedListDefinitionClass;
import person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataInputAndManipulation input = new DataInputAndManipulation();
        MyLinkedListDefinitionClass<Person> list = new MyLinkedListDefinitionClass<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program \n");
            int ch = scanner.nextInt();
            scanner.nextLine();
            switch (ch) {
                case 1:
                    list.add(input.insert());
                    if (list.getSize() > 1) {
                        list.sort(list);
                    }
                    break;
                case 2:
                    DataInputAndManipulation inputAndManipulation = new DataInputAndManipulation();
                    inputAndManipulation.printContactDetails(list);
                    break;
                case 3:
                    System.out.println("Enter the first name to be searched: ");
                    String firstName = scanner.nextLine();
                    DataInputAndManipulation inputAndManipulation1 = new DataInputAndManipulation();
                    inputAndManipulation1.search(firstName, list);
                    break;
                case 4:
                    input.delete(list);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Entry !!!");
            }
        }
    }
}
