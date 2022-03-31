package com.company;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(2, 4);
        Fraction fr2 = new Fraction(2, 8);

        Fraction mult = fr1.multiplicate(fr2);
        mult.print();
    }
}
