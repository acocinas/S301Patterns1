package com.level2.abstractFactory.entities;
//Paso 4
import com.level2.abstractFactory.interfaces.*;

public class UKFactory implements AddressBookFactory {
    @Override
    public Address createAddress(String... details){
        // details[0] = buildingNumber, details[1] = streetName, details[2] = city,
        // details[3] =
        /**
         * @param details[0] = buildingNumber
         * @param details[1] = streetName
         * @param details[2] = city
         * @param details[3] = postcode
         */
        return new UKAddress(details[0],details[1],details[2],details[3]);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new UKPhoneNumber(phoneNumber);
    }
}
