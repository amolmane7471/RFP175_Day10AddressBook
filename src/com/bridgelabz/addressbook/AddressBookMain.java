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
			System.out.println("Enter a choice : \n 1.AddContact \n 2.DisplayContact \n 3.Exit");	
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			addressbook.addContact();
			break;
		case 2:
			addressbook.displayContact();
			break;
		default :
			System.out.println("enter valid choice");
		}
		}while(choice != 3);
	}

}
