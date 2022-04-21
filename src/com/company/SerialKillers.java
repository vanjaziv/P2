package com.company;

import java.util.HashSet;

public class SerialKillers {

    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");


        for(String s : serialNicknames){
            System.out.println(s);
        }
        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Edmund Kemper"));
        System.out.println(serialNicknames.add("Jack the Ripper"));
        for(String s : serialNicknames){
            System.out.println(s);
        }
       // serialNicknames.retain
        // zweites set nur für americans
        HashSet<String> americanSerialKillers = new HashSet<>();
        americanSerialKillers.add("Ted Bundy");
        americanSerialKillers.add("Edmund Kemper");
        americanSerialKillers.add("Hannibal Lecter");
        serialNicknames.retainAll(americanSerialKillers);
        System.out.println("----------------");
        for(String s : serialNicknames){
            System.out.println(s);
        }
    }
}
