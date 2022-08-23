package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> contactList = new ArrayList<>();
	
	public void addContact()
	{
		Contacts contact = new Contacts();	
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
		contactList.add( contact);
	}

	public void displayContact()
	{
	for (int i =0 ; i < contactList.size() ; i++)
	{
	Contacts contact = contactList.get(i); 
	System.out.println(contact.toString());
	}
	}
	
	public void editContact()
	{
		System.out.println("Enter Name Of Person To Edit Contact Details \n");
		String name = sc.next();
		boolean isAvailable = false;
	    for(Contacts contact : contactList)
	    {
	    if (name.equals(contact.getFirstName())) 
		{	
	    	isAvailable = true;
			System.out.println("Enter choise to edit :\n 1.firstName \n 2.lastName \n 3.address \n 4.city \n 5.state  \n 6.zip \n 7.phoneNo \n 8.email ");
	       	int choise = sc.nextInt();
		    switch (choise) {
		           	case 1: 
			            	System.out.println("Enter First Name");
			                 String firstName = sc.next();
			                 contact.setFirstName(firstName);
			                 break;
			            case 2:
			                 System.out.println("Enter Last Name");
			                 String lastName = sc.next();
			                 contact.setLastName(lastName);
			                 break;
			            case 3:
				             System.out.println("Enter Address");
			                 String address =  sc.next();
			                 contact.setAddress(address);
			                 break;
			            case 4:
			                 System.out.println("Enter City");
			                 String city = sc.next();
			                 contact.setCity(city);
			                 break;
			            case 5:
			                 System.out.println("Enter State");
			                 String state = sc.next();
			                 contact.setState(state);
			                 break;
			            case 6:
			                 System.out.println("Enter ZIP Code");
			                 String zip = sc.next();
			                 contact.setZipCode(zip);
			             	break;
			            case 7:
			                 System.out.println("Enter your phone number");
			                 String phoneNo = sc.next();
			                 contact.setPhoneNo(phoneNo);
			                 break;
			            case 8:
			                 System.out.println("Enter Email ID");
			                 String email = sc.next();
			                 contact.setEmail(email);
			                 break;
	       	           	}
				}
	    	}
	    if(isAvailable == false)
	    {
	    	System.out.println("contact doesn't exist");
	    }
	}
	
	public void deleteContact()
	   {		  
		System.out.println("Enter the name of the Person to Delete the contact details");
	    String name = sc.next();
	    boolean isAvailable = false;
	    for(Contacts contact : contactList)
	    {
	    if (name.equals(contact.getFirstName())) 
		{	
	    	isAvailable = true;
			contactList.remove(contact);
			System.out.println("Deleted Successfully!");
			break;
		}
	    }
	    if(isAvailable == false)
	    {
	    	System.out.println("contact doesn't exist");
	    }
	   }

}

