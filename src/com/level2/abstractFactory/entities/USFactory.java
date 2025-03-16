package com.level2.abstractFactory.entities;
//paso 4
import com.level2.abstractFactory.interfaces.*;

public class USFactory implements AddressBookFactory {
    @Override
    public Address createAddress(String... details){
        // details[0] = streetNumber, details[1] = streetName, details[2] = city,
        // details[3] = state, details[4] = zipCode
        return new USAddress(details[0],details[1],details[2],details[3],details[4]);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new USPhoneNumber(phoneNumber);
    }
}
