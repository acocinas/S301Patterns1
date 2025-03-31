package com.level2.abstractFactory.factories;
//paso 4
import com.level2.abstractFactory.interfaces.*;
import com.level2.abstractFactory.model.USAddress;
import com.level2.abstractFactory.model.USPhoneNumber;

public class USFactory implements AddressBookFactory {
    @Override
    public Address createAddress(String... details){
        /**
         * @param details[0] = streetNumber
         * @param details[1] = streetName
         * @param details[2] = city
         * @param details[3] = state
         * @param details[4] = zipcode
         */
        return new USAddress(details[0],details[1],details[2],details[3],details[4]);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber){
        return new USPhoneNumber(phoneNumber);
    }
}
