package com.company;

import java.util.Arrays;

public class OstenApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter", 77);
        Osterhase marla = new Osterhase("Marla");
        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());

        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());

//        dieter.setName("Dieter (formerly known as Hansi)");
//        dieter.setAnzahlVersteckteEier(5);
        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());

        // möchte ein ei zu der bisherigen summe addieren
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());

        //System.out.println(dieter.anzahlVersteckteEier);
        //dieter.anzahlVersteckteEier = -2;
        //System.out.println(dieter.anzahlVersteckteEier);
    }
}
