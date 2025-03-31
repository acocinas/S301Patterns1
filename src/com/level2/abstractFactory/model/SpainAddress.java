package com.level2.abstractFactory.model;
//Paso 2
import com.level2.abstractFactory.interfaces.Address;

public class SpainAddress implements Address {
    private final String streetName, streetNumber, postCode, city;

    public SpainAddress(String streetName, String streetNumber, String postCode, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
    }

    @Override
    public String getAddress() {
        return streetName + " " + streetNumber + ", " + postCode + ", " + city;
    }

    @Override
    public String toString() {
        return getAddress();
    }
}
