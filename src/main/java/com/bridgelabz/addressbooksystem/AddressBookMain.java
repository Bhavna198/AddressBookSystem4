package com.bridgelabz.addressbooksystem;

import java.util.List;
import java.util.Scanner;


public class AddressBookMain {
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        AddressBookDetails addressBookDetails = new AddressBookDetails();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Name");
        String firstName = sc.next();
        addressBookDetails.setFirstName(firstName);
        System.out.println("Enter the last Name");
        String lastName = sc.next();
        addressBookDetails.setLastName(lastName);
        System.out.println("Enter the address");
        String address = sc.next();
        addressBookDetails.setAddress(address);
        System.out.println("Enter the city");
        String city = sc.next();
        addressBookDetails.setCity(city);
        System.out.println("Enter the state");
        String state = sc.next();
        addressBookDetails.setState(state);
        System.out.println("Enter the Email id");
        String email = sc.next();
        addressBookDetails.setEmail(email);
        System.out.println("Enter the Phone Number");
        String phoneNumber = sc.next();
        addressBookDetails.setPhoneNumber(phoneNumber);
        System.out.println("Enter the Zip Code");
        int zipCode = sc.nextInt();
        addressBookDetails.setZipCode(zipCode);

        addressBook.addAddressBookDetail(addressBookDetails);
        printAddressBook();
    }

    private static void printAddressBook() {
        List<AddressBookDetails> allAddressBookDetails = addressBook.getAllAddressBookDetails();
        allAddressBookDetails.forEach(System.out::println);
    }
}

