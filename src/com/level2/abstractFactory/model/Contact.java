package com.level2.abstractFactory.model;

import com.level2.abstractFactory.interfaces.*;

public class Contact {
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber){
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress(){
        return address;
    }

    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Dirección: " + getAddress() + ", teléfono: " + getPhoneNumber();
    }
}
