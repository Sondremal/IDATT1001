import java.util.Scanner;


public class O1Oppgave2 {


    public static void main(String[] args){
 
    // Dette programmet skal gjøre om timer, minutter og sekunder til totalt antall sekunder.
    Scanner in = new Scanner(System.in);
    System.out.println("Dette er et program som gjør om timer, minutter og sekunder til totalt antall sekunder.");

    System.out.println("Skriv inn antall timer.");
    double timer = in.nextDouble();
    
    System.out.println("Skriv inn antall minutter.");
    double minutter = in.nextDouble();

    System.out.println("Skriv inn antall sekunder.");
    double sekunder = in.nextDouble();

    double minutterTotal = minutter + timer * 60;
    double sekunderTotal = sekunder + minutterTotal * 60;

    System.out.println("Det er totalt: " + sekunderTotal + " sekunder.");
    }
}
