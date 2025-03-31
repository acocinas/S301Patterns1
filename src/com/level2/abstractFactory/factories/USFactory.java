package com.level2.abstractFactory.factories;
//paso 4
import com.level2.abstractFactory.interfaces.*;
import com.level2.abstractFactory.model.USAddress;
import com.level2.abstractFactory.model.USPhoneNumber;

public class USFactory implements AddressBookFactory {
    @Override
    public Address createAddress(Address address){
        /**
         * streetNumber
         * streetName
         * city
         * state
         * zipcode
         */
        return new USAddress("","","","","");
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new USPhoneNumber(phoneNumber);
    }
}
