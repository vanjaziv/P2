package com.company;

public class Beagle extends Dog {

    public String lovedFood;


        // situation when we have default constractor (has not parametar)
        // Dog() constructor is called automatically
        // nur this.lovedFood = lovedFood;
        // super(); // calling parent constructor (is done automatically)
        // situation when we have no default constractor(every constractor has at least one parameter)
        public Beagle (String name, String eyeColor, int weight, boolean appreciatesOtherDogs, String lovedFood) {
            super(name, eyeColor, weight, appreciatesOtherDogs);

            this.lovedFood = lovedFood;

        }
        @Override
        public void bark(){
            //eat(); we know that we can easily call other methods
            super.bark(); // we use super to referance implementation in the parent class
            }
    }

