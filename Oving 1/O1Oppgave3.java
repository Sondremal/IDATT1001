import java.util.Scanner;



public class O1Oppgave3{
    
    public static void main(String[]args){

    // Dette programmet skal gjøre om antall sekunder til timer, minutter og sekunder.
    Scanner in = new Scanner(System.in);

    System.out.println("Dette er et program som gjør om antall sekunder til timer, minutter og sekunder.");
    System.out.println("Skriv inn antall sekunder:");

    double sekunderTotal = in.nextDouble();
    
    int timer = (int)sekunderTotal / 3600;
    int restSekunderTimer = (int)sekunderTotal % 3600;

    int minutter = restSekunderTimer / 60;
    int restSekunderMinutter = restSekunderTimer % 60;




    System.out.println(sekunderTotal + " sekunder er det samme som: " + timer + " timer, " + minutter + " minutter, og " + restSekunderMinutter + " sekunder.");


    }

}
