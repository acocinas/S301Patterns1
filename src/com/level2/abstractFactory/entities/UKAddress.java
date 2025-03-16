package com.level2.abstractFactory.entities;
//Paso 2
import com.level2.abstractFactory.interfaces.Address;

public class UKAddress implements Address {
    private final String buildingNumber, streetName, city, postCode;

    public UKAddress(String buildingNumber, String streetName, String city, String postCode) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String getAddress() {
        return buildingNumber + " " + streetName + ", " + city + ", " + postCode;
    }

    @Override
    public String toString() {
        return getAddress();
    }
}
