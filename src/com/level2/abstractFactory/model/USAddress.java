package com.level2.abstractFactory.model;
//paso 2
import com.level2.abstractFactory.interfaces.Address;

public class USAddress implements Address {
    private final String streetNumber, streetName, city, state, zipCode;

    public USAddress(String streetNumber, String streetName, String city, String state, String zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String getAddress() {
        return streetNumber + " " + streetName + ", " + city + ", " + state + ", " + zipCode;
    }

    @Override
    public String toString() {
        return getAddress();
    }
}
