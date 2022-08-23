package com.bridgelabz.addressbook;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome TO Address Book System\n");
		AddressBook addressbook = new AddressBook();
		int choice; 
		do
		{
			System.out.println("Enter a choice : \n 1.Add Contact \n 2.Display Contact \n 3.Edit Contact \n 4.DeleteContact \n 5.Exit");	
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			addressbook.addContact();
			break;
		case 2:
			addressbook.displayContact();
			break;
		case 3:
			addressbook.editContact();
			break;
		case 4:
			addressbook.deleteContact();
			break;
		default :
			System.out.println("enter valid choice");
		}
		}while(choice != 5);
	}

}
