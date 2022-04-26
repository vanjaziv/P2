package com.company;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);

        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle max = new Beagle("Hansi", "blue", 80, false, "everythng");
        System.out.println(max);


    }
}
