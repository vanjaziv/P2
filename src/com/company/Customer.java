package com.company;

import java.util.ArrayList;

public class Customer extends Person{

    private int costumerNumber;
    private ArrayList<Address> Addresses = new ArrayList<>();

    public Customer(String firstName, String lastName, int costumerNumber) {
        super(firstName, lastName);
        this.costumerNumber = costumerNumber;
    }

    public void addAddress(Address a){
        Addresses.add(a);
    }
//    @Override
//    public void eatChocolate(int x){
//        super.doSomething();
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "costumerNumber=" + costumerNumber +
                ", Addresses=" + Addresses + "person: " + lastName +
                '}';
    }
}

