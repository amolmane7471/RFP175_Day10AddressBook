package com.bridgelabz.addressbook;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	Contacts contact = new Contacts();
	public void addContact()
	{
		
		System.out.println("Enter first name");
		contact.setFirstName(sc.next());
		System.out.println("Enter last name");
		contact.setLastName(sc.next());
		System.out.println("Enter address");
		contact.setAddress(sc.next());
		System.out.println("Enter city");
		contact.setCity(sc.next());
		System.out.println("Enter state");
		contact.setState(sc.next());
		System.out.println("Enter email");
		contact.setEmail(sc.next());
		System.out.println("Enter phone number");
		contact.setPhoneNo(sc.next());
		System.out.println("Enter zip code");
		contact.setZipCode(sc.next());
	}

	public void displayContact()
	{
	System.out.println(contact.toString());
	}
}
