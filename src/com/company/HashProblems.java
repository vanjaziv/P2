package com.company;

import java.util.HashSet;

public class HashProblems {
    public static void main(String[] args) {
        // zeigen, dass theoretisch unterschidliche objekte gleichen hashcode haben können
        String s1 = "VII";
        String s2 = "Ugh";
        Osterhase marla = new Osterhase("Marla");
        Account a1 = new Account("Mein Konto", "AT...", "BAWBA");
        Account a2 = new Account("Mein 2. Konto", "AT...", "BAWBA");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(marla.hashCode());

        HashSet<Account> bank = new HashSet<>();
        System.out.println(bank.add(a1));
        System.out.println(bank.add(a2));


    }
}
