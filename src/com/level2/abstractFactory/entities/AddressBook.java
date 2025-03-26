package com.level2.abstractFactory.entities;
//Paso 5
import com.level2.abstractFactory.interfaces.*;

import java.util.*;

public class AddressBook {

    private final List<Contact> contacts = new ArrayList<>();
    private final AddressBookFactory factory;

    public AddressBook(AddressBookFactory factory){
        this.factory = factory;
    }

    public void addContact(String[] addressDetails, String phoneNumber){
        Address address = factory.createAddress(addressDetails);
        PhoneNumber phone = factory.createPhoneNumber(phoneNumber);

        Contact contact = new Contact(address, phone);
        contacts.add(contact);
    }
    public void printContacts() {
        System.out.println("Contactos: ");
        contacts.forEach(System.out::println);
        System.out.println("-------------------------");
    }
}
