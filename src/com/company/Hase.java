package com.company;

import java.util.StringTokenizer;

public class Hase {

    public String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(name + " schläft");
    }
    public void hoppeln(){
        System.out.println(name + " hoppelt");
    }
    public void fressen(){
        System.out.println(name + " frisst");
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                '}';
    }
}
