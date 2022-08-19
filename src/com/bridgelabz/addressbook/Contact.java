package com.bridgelabz.addressbook;

public class Contact {
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private String email;
private String phoneNo;
private String zipCode;

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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

@Override
public String toString() {
	return "Contact\n ["
			+ "firstName = " + firstName + "\n"
			+ "lastName = " + lastName + "\n"
			+ "address = " + address + "\n"
			+ "city = " + city + "\n"
			+ "state = " + state + "\n"
			+ "email = " + email + "\n"
			+ "phoneNo = " + phoneNo + "\n"
			+ "zipCode = " + zipCode + "]";
	}

}
