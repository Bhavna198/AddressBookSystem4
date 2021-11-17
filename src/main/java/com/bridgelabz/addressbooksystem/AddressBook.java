package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Making the list to store the data and by getter setter method get the details.
 */

public class AddressBook {
    private List<AddressBookDetails> addressBookDetails = new ArrayList<>();

    public List<AddressBookDetails> getAllAddressBookDetails() {
        return addressBookDetails;
    }

    public void addAddressBookDetail(AddressBookDetails addressBookDetails) {
        this.addressBookDetails.add(addressBookDetails);
    }
}

