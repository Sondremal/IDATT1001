package Oppgave1;

public class Testklient {
    public static void main(String[] args) {

        // Addisjon
        Fraction f1 = new Fraction(6, 5);
        Fraction f2 = new Fraction(4, 9);
        f1.addition(f2);
        System.out.println(f1.toString());

        // Subtraksjon
        f1 = new Fraction(10, 41);
        f2 = new Fraction(2, 9);
        f1.subtraction(f2);
        System.out.println(f1.toString());

        // Multiplikasjon
        f1 = new Fraction(6, 11);
        f2 = new Fraction(3);
        f1.multiplication(f2);
        System.out.println(f1.toString());

        // Divisjon (med get-metoder i stedet for toString())
        f1 = new Fraction(4, 5);
        f2 = new Fraction(34, 45);
        f1.division(f2);
        System.out.println(f1.getNumerator() + "/" + f1.getDenominator());

        // Hva om man setter teller lik 0?
        try {
            f1 = new Fraction(6, 0);
            f2 = new Fraction(3, 11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
