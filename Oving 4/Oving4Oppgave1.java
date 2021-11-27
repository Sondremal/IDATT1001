import java.util.Scanner;

public class Oving4Oppgave1 {
    public static void main(String[] args) {
        Valuta val = new Valuta();
        Scanner in = new Scanner(System.in);
        double penger;
        int valuta;

        System.out.println("Dette er et program som vil hjelpe deg med å regne om pengebeløp fra forskjellige valutaer til norske kroner.");
        System.out.println("Velg valuta:");
        System.out.println("1: dollar \n2: euro \n3: svenske kroner \n4: avslutt");

        valuta = in.nextInt();

        if (valuta == 4) {
            System.out.println("Programmet avsluttes...");
            System.exit(0);
        } else {

            System.out.println("\n1: konvertere fra norske kroner \n2: konvertere til norske kroner");
            int valg = in.nextInt();

            if (valg == 1) {
                System.out.println("Skriv inn antall som skal konverteres:");
                penger = in.nextDouble();
                System.out.println(val.fraNorskeKroner(penger, valuta));
            }

            else {
                System.out.println("Skriv inn antall som skal konverteres:");
                penger = in.nextDouble();
                System.out.println(val.tilNorskeKroner(penger, valuta));
            }

        }
    }

}
