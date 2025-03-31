package com.level2.abstractFactory.factories;
//Paso 4
import com.level2.abstractFactory.interfaces.*;
import com.level2.abstractFactory.model.SpainAddress;
import com.level2.abstractFactory.model.SpainPhoneNumber;

public class SpainFactory implements AddressBookFactory {
    @Override
    public Address createAddress(Address address){
        /**
         * streetName
         * streetNumber
         * postCode
         * city
         */
        return new SpainAddress("", "", "", "");
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new SpainPhoneNumber(phoneNumber);
    }
}
