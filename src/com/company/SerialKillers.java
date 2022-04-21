package com.company;

import java.util.ArrayList;
import java.util.HashMap;
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
        for(String s : serialNicknames){
            System.out.println(s);
            System.out.println("-----------------");
        }


        // zurück zur hashmap
        // in einer hashmap möchten wir alle opfer unserer serialkiller speichern
        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        // wenn ich hier und nicht in vorschleife die arraylist erzeuge
        // dann habe ich ingesamt nur eine arraylist und würde jedem serienkiller die gleiche arraylist zuweisen
        for(String crazyAmerican: americanSerialKillers){
            ArrayList<String> o = new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");
            o.add("Opfer 3");

            opfer.put(crazyAmerican, o);
        }
        ArrayList<String> opfi = opfer.get("Ted Bundy");

        opfi.add("Opfer 4");
    }
}
