package com.level2.abstractFactory.factories;

import com.level2.abstractFactory.enums.Country;
import com.level2.abstractFactory.interfaces.AddressBookFactory;

public class FactoryProvider {
    public static AddressBookFactory getFactory(Country country){
        return switch (country){
            case SPAIN -> new SpainFactory();
            case UK -> new UKFactory();
            case US -> new USFactory();
        };
    }
}
