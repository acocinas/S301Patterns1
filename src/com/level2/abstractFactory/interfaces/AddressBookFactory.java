package com.level2.abstractFactory.interfaces;
//Paso 3
public interface AddressBookFactory {
    Address createAddress(String... details);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
