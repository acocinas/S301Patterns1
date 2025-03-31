package com.level2.abstractFactory.factories;
//Paso 4
import com.level2.abstractFactory.interfaces.*;
import com.level2.abstractFactory.model.SpainAddress;
import com.level2.abstractFactory.model.SpainPhoneNumber;

public class SpainFactory implements AddressBookFactory {
    @Override
    public Address createAddress(String... details){
        /**
         * @param details[0] = streetName
         * @param details[1] = streetNumber
         * @param details[2] = postCode
         * @param details[3] = city
         */
        return new SpainAddress(details[0],details[1],details[2],details[3]);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new SpainPhoneNumber(phoneNumber);
    }
}
