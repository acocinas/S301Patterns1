package com.level2.abstractFactory.factories;
//Paso 4
import com.level2.abstractFactory.interfaces.*;
import com.level2.abstractFactory.model.UKAddress;
import com.level2.abstractFactory.model.UKPhoneNumber;

public class UKFactory implements AddressBookFactory {
    @Override
    public Address createAddress(Address address){
        /**
         * buildingNumber
         * streetName
         * city
         * postcode
         */
        return new UKAddress("","","","");
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new UKPhoneNumber(phoneNumber);
    }
}
