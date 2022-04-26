package com.company;

public class HaseDemo {
    public static void main(String[] args) {
        Hase h = new Hase("Hansi");
        System.out.println(h);
        h.hoppeln();
        h.fressen();
        h.schlafen();
        Weihnachtshase h1 = new Weihnachtshase("Maxi");
        System.out.println(h1);
        h1.hoppeln();
        Osterhase1 h2 = new Osterhase1("Susi");
        System.out.println(h2);
        h2.versteckeOstereier();
        Hase hase1 = h2;
        hase1.hoppeln();
        Hasenstall hs = new Hasenstall();
        hs.addHase(h);
        hs.addHase(h1);
        hs.addHase(h2);
        hs.hoppelAll();

        // try around with up and downcasting
        Osterhase1 o1 = new Osterhase1("Mrs. Egg");
        Hase h3 = new Hase("Common rabbit(but cute)");
        Weihnachtshase w2 = new Weihnachtshase("Mr. Snow");

        Weihnachtshase wh;
        Osterhase oh;
        Hase ha;

        // vererbungshierarchie
        //                 -----> Osterhase
        // Object ----> Hase ----
        //                ------> Weihnachtshase


        // upcasting: assigning a child to a reference of its parent class (example: h = o1 - assign from right(child class Osterhase) to left (parent class Hase) )
        // what is the difference if I access now my Mrs. Egg via the h Hase reference
        // the method versteckeOstereier is missing because we only see attributes and methods already teh Hase has

        ha = o1;
        ha.hoppeln();

       // what is DOWN CASTING?
       // assigning a general type to a more specialized type
        // this only works if a general reference already refers to a specialized object instance

        //wh = (Weihnachtshase) h3; // this gives us a ClassCastException
        // but there are special cases when down casting works(I will have to upcast before)

        ha = w2; // this happened somewhere before (could be years)
        //but we know that behind this hase reference is really a Weihnachtshase

        wh = (Weihnachtshase) ha;
        wh.verteileGeschenke();
        ha.hoppeln();
        wh.hoppeln();

    }
}