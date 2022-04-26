package com.company;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println("Weihnachtshase " + name + " vertielt Geschenke");
    }

    @Override
    public void hoppeln() {
        System.out.println("Weinachtshase " + name + " sings from the bottom of his heart!");
    }
}
