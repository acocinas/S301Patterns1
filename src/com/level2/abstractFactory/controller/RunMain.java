package com.level2.abstractFactory.controller;

import com.level2.abstractFactory.entities.*;

public class RunMain {
    public static void run(){

        AddressBook spainAddressBook = new AddressBook(new SpainFactory());
        //SpainAddress(String streetName, String streetNumber, String postCode, String city
        spainAddressBook.addContact(new String[]{"Glorieta Puente de Segovia", "3", "28011", "Madrid"},
                "91 548 91 92");
        spainAddressBook.addContact(new String[]{"Calle de las Fuentes", "4", "24648", "Robledo de Fenar(León)"},
                "98 759 12 45");
        System.out.println("Agenda de España: ");
        spainAddressBook.printContacts();

        AddressBook UKAddressBook = new AddressBook(new UKFactory());
        //UKAddress(String buildingNumber, String streetName, String city, String postCode)
        UKAddressBook.addContact(new String[]{"20", "Peel Street", "London", "W8 7PD"}, "020 7727 2462");
        UKAddressBook.addContact(new String[]{"324/330", " Deansgate(Campfield Avenue Arcade)", "Manchester", "M3 4FN"},
                "0161 661 4200");
        System.out.println("Agenda de Reino Unido: ");
        UKAddressBook.printContacts();

        AddressBook USAddressBook = new AddressBook(new USFactory());
        //USAddress(String streetNumber, String streetName, String city, String state, String zipCode)
        USAddressBook.addContact(new String[]{"180", "North Michigan Ave.(Suite 1500)", "Chicago", "IL", "60611"},
                "312 782-4588 / 312 782-4589");
        USAddressBook.addContact(new String[]{"150", "East 58th St.(30th Floor)", "New York", "N.Y.", "10155"},
                "202 55-4080/4081");
        System.out.println("Agenda de USA: ");
        USAddressBook.printContacts();
    }
}
