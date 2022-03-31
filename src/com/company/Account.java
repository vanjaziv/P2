package com.company;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account(String owner, String iban, String bic){
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
    }

    public double add (double wert){
       if(wert > 0){
           balance +=wert;
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
}
