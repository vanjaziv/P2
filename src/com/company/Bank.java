package com.company;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account("Mein Konto", "AT...", "BAWBA");
        Account a2 = new Account("Dein Konto", "AT...", "HZGR");
        Account a3 = new Account("Ihr Konto", "AT...", "ÖLJF");

        a1.add(1000);
        a2.add(400);
        a3.add(300);

        // Account []accounts = new Account[3];
        Account []accounts = {a1, a2, a3};

        for(Account a : accounts){
            System.out.println(a.getBalance());
        }

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getBalance());
        }

    }
}
