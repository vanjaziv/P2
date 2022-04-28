package com.company;

import java.util.Objects;

public class SamenotSame {
    public static void main(String[] args) {
        // we want to finde out which class an object is
        // there are two different ways
        //if possible don't use them at all --> use polpymorphisum ---> base class(with the same method)

        // situation 1: check objext of a class is exactly this class
        // (maybe less usiful than other one)

        Beagle b = new Beagle("Doggo", "black", 17, true, "Spagethii");

        System.out.println(b.getClass());
        System.out.println(Beagle.class);

        if (b.getClass().equals(Beagle.class)) {
            System.out.println("The same");
        }

        Object obj = b;
        System.out.println(obj.getClass());
        if (obj.getClass().equals(Beagle.class)) {
            Beagle b2 = (Beagle) obj;
        }

        if (b instanceof Beagle) {
            System.out.println("yes");
        }

        if (b instanceof Dog) {
            System.out.println("yes");

        }

        if (obj instanceof Dog) {
            System.out.println("yes");

        }
    }
}
