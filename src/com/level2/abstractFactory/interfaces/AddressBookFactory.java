package com.level2.abstractFactory.interfaces;
//Paso 3
public interface AddressBookFactory {
    Address createAddress(Address address);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
