package com.bridgelabz.oops;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to address book program");

		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
	
		System.out.println(addressBook.contactsArrayList);
		System.out.println("*************");

		addressBook.editContact();

		for (Contacts contact:addressBook.contactsArrayList) {
			System.out.println(contact);
		}


	}

}
