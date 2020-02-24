package person;

import myLinkedList.MyLinkedListDefinitionClass;

public class Person {
    MyLinkedListDefinitionClass<Long> contactNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person(String firstName, String lastName, String emailAddress, MyLinkedListDefinitionClass contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
    }

    public MyLinkedListDefinitionClass<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(MyLinkedListDefinitionClass<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
