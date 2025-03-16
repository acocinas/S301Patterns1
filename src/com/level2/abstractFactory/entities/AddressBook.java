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

    public void printContacts(){
        System.out.println("Contactos: ");
        for (Contact contact : contacts){
            System.out.println(contact);
            System.out.println("-------------------------");
        }
    }

//    public void addPhoneNumber(String phoneNumber){
//        PhoneNumber phone = factory.createPhoneNumber(phoneNumber);
//        phoneNumbers.add(phone);
//    }
//
//    public void printContacts(){
//        System.out.println("Direcciones: ");
//        for (Address address : addresses){
//            System.out.println("* " + address.getAddress());
//        }
//        System.out.println("\nNúmeros de teléfono: ");
//        for (PhoneNumber phone : phoneNumbers){
//            System.out.println("* "+ phone.getPhoneNumber());
//        }
//   }

}
