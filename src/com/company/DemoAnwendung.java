package com.company;

public class DemoAnwendung {
    public static void main(String[] args) {
        Address a1 = new Address("Neue Welt 7", "8010", "Graz","AT");
        Address a2 = new Address("Himmelreichgasse 12", "8043", "Graz","AT");

        Customer c1 = new Customer("Ana", " Weber", 1);
        Customer c2 = new Customer("Lala", " LaLa", 2);

        c1.addAddress(a1);
        c2.addAddress(a2);
        System.out.println(c1);
        System.out.println(c2);
        c1.doSomething();
    }
}
