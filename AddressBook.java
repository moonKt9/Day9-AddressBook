package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);

    List<Contacts> contactsArrayList = new ArrayList<Contacts>();
    public void addContact() {
        Contacts contacts = new Contacts();
        System.out.println("Enter firstName");
        String firstName = scanner.next();
        contacts.setFirstName(firstName);
        System.out.println("Enter LastName");
        String lastName = scanner.next();
        contacts.setLastName(lastName);
        System.out.println("Enter Email");
        String email = scanner.next();
        contacts.setEmail(email);
        System.out.println("Enter Phn No.");
        String phoneNumber = scanner.next();
        contacts.setPhoneNumber(phoneNumber);
        System.out.println("Enter Zip");
        String zip = scanner.next();
        contacts.setZip(zip);
        System.out.println("Enter City");
        String city = scanner.next();
        contacts.setCity(city);
        System.out.println("Enter State");
        String state = scanner.next();
        contacts.setState(state);
        System.out.println("Enter Address");
        String address = scanner.next();
        contacts.setAddress(address);
        contactsArrayList.add(contacts);
        System.out.println(contacts.toString());
    }

    public void editContact() {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String firstName = scanner.next();
        boolean flag = false;
        for (Contacts contact:contactsArrayList) {
            if(firstName.equals(contact.getFirstName())){
                contact.editContact();
                System.out.println("Contact edited successfully!");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("The contact with first name : "+firstName+" is not found!");
        }

    }
}

