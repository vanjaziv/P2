package com.company;

public class Osterhase1 extends Hase {

    public Osterhase1(String name) {
        super(name);
    }

    public void versteckeOstereier(){
        System.out.println(name + " versteckt Ostereier");
    }

    @Override
    public void hoppeln(){
        System.out.println("Osterhase " + name + " springt durch die Luft und versteckt Eier");
    }
}
