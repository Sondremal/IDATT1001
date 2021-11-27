package Oppgave1;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator can not be 0.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public void addition(Fraction y) {
        // Ganger med den andre brøkens nevner oppe og nede
        this.numerator = (this.numerator * y.denominator) + (y.numerator * this.denominator);
        this.denominator *= y.denominator;
    }

    public void subtraction(Fraction y) {
        this.numerator = (this.numerator * y.denominator) - (y.numerator * this.denominator);
        this.denominator *= y.denominator;
    }

    public void multiplication(Fraction y) {
        this.numerator *= y.numerator;
        this.denominator *= y.denominator;
    }

    public void division(Fraction y) {
        this.numerator *= y.denominator;
        this.denominator *= y.numerator;
    }

    public String toString() {
        return String.format("%s/%s", numerator, denominator);
    }

}
