package com.level2.abstractFactory.application;

import com.level2.abstractFactory.factories.SpainFactory;
import com.level2.abstractFactory.factories.UKFactory;
import com.level2.abstractFactory.factories.USFactory;
import com.level2.abstractFactory.model.*;

public class AddressBookManager {
    public static void start(){

        AddressBook spainAddressBook = new AddressBook(new SpainFactory());
        /*
          * Orden y datos para la agenda de España
          * SpainAddress(String streetName, String streetNumber, String postCode, String city),phoneNumber);
         */
        spainAddressBook.addContact(new SpainAddress("Glorieta Puente de Segovia", "3", "28011", "Madrid"),
                "91 548 91 92");
        spainAddressBook.addContact(new SpainAddress( "Calle de las Fuentes", "4", "24648", "Robledo de Fenar(León)"),
                "98 759 12 45");
        System.out.println("Agenda de España: ");
        spainAddressBook.printContacts();

        AddressBook UKAddressBook = new AddressBook(new UKFactory());
        /*
          * Orden y datos para la agenda de UK
          * UKAddress(String buildingNumber, String streetName, String city, String postCode)
         */
        UKAddressBook.addContact(new UKAddress( "20", "Peel Street", "London",
                "W8 7PD"), "020 7727 2462");
        UKAddressBook.addContact(new UKAddress( "324/330", " Deansgate(Campfield Avenue Arcade)",
                        "Manchester", "M3 4FN"), "0161 661 4200");
        System.out.println("Agenda de Reino Unido: ");
        UKAddressBook.printContacts();

        AddressBook USAddressBook = new AddressBook(new USFactory());
        /*
          * Orden y datos para la agenda de USA
          * USAddress(String streetNumber, String streetName, String city, String state, String zipCode)
         */
        USAddressBook.addContact(new USAddress ("180", "North Michigan Ave.(Suite 1500)",
                        "Chicago", "IL", "60611"), "312 782-4588 / 312 782-4589");
        USAddressBook.addContact(new USAddress ("150", "East 58th St.(30th Floor)", "New York",
                        "N.Y.", "10155"),"202 55-4080/4081");
        System.out.println("Agenda de USA: ");
        USAddressBook.printContacts();
    }
}
