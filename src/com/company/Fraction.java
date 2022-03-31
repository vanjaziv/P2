package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public double toDecimal(){
        return(double)numerator / denominator;
    }
    public void print(){
        System.out.println(numerator + " / " + denominator);
    }
    public Fraction multiplicate(Fraction b2){
        Fraction erg = new Fraction(numerator, denominator);

        erg.numerator = erg.numerator * b2.numerator;
        erg.denominator = erg.denominator * b2.denominator;

        return erg;
    }

}
