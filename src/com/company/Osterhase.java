package com.company;

public class Osterhase {
    private String name;
    private int anzahlVersteckteEier;

    public Osterhase(String name,int anzahlVersteckteEier){
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    public Osterhase(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;

    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if(anzahlVersteckteEier >= 0){
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    public void  aendereAnzhalEier(int anzahlVersteckteEier){
//        // ich kann sicherstelle, dass kein blödsin gemacht wird
//        if(anzahlVersteckteEier >= 0){
//
//        }
//        // lokale varieable oder parameter mit gleiche namen werden bevorgzugt
//        // anzhalVersteckteEier --> parameter
//        // this referenz zeigt auf die aktuelle instanz
//        this.anzahlVersteckteEier = anzahlVersteckteEier;
//
//    }
//
//    // methoden uberladen - unterscheidet sich durch typ/anzahl der parameter
//    // hier haben wir eine ohne Parameter -> dann sollOsterhase ein Dutzend Eier verstecken
//    public void aendereAnzhalEier(){
//        anzahlVersteckteEier = 12;
//        // this.anzhal... wäre möglich aber nicht notwendig, da keine nameglaichheit
//
//    }
//    public int gibMirAnzhalDerVersteckenEier(){
//        return anzahlVersteckteEier;
//    }

}
