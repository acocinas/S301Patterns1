package com.level2.abstractFactory.entities;
//Paso 2
import com.level2.abstractFactory.interfaces.PhoneNumber;

public class USPhoneNumber implements PhoneNumber {

    private final String internationalPrefix = "+1";
    private final String phoneNumber;

    public USPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String getPhoneNumber(){
        return internationalPrefix + phoneNumber;
    }

    @Override
    public String toString() {
        return getPhoneNumber();
    }
}
