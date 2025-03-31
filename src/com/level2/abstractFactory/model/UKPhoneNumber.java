package com.level2.abstractFactory.model;
//Paso 2
import com.level2.abstractFactory.interfaces.PhoneNumber;

    public class UKPhoneNumber implements PhoneNumber {

        private final String internationalPrefix = "+44 ";
        private final String phoneNumber;

        public UKPhoneNumber (String phoneNumber){
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

