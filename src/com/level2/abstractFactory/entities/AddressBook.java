package com.level2.abstractFactory.entities;
//Paso 5
import com.level2.abstractFactory.interfaces.*;

import java.util.*;

public class AddressBook {

    private final List<Address> addresses = new ArrayList<>();
    private final List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private final AddressBookFactory factory;

    public AddressBook(AddressBookFactory factory){
        this.factory = factory;
    }

    public void addAddress(String... details){
        Address address = factory.createAddress(details);
        addresses.add(address);
    }

    public void addPhoneNumber(String phoneNumber){
        PhoneNumber phone = factory.createPhoneNumber(phoneNumber);
        phoneNumbers.add(phone);
    }

    public void printContacts(){
        System.out.println("Direcciones: ");
        for (Address address : addresses){
            System.out.println("* " + address.getAddress());
        }
        System.out.println("\nNúmeros de teléfono: ");
        for (PhoneNumber phone : phoneNumbers){
            System.out.println("* "+ phone.getPhoneNumber());
        }
    }

}
