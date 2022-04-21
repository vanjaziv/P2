package com.company;

import java.util.Objects;

public class Account {
    private static int uniqueID = 1;
    private String name;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    public static int getUniqueID() {
        return uniqueID;
    }

    public Account(String name, String iban, String bic) {

        this.name = name;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
        accountID = uniqueID++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double add(double wert) {
        if (wert > 0){
            balance += wert;
        }
        return wert;
    }


    public double deposit(double wert) {
        if (wert > 0) {
            if (wert < balance) {

                balance = balance - wert;
            } else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }

    public double getBalance(){
        return balance;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }
}