import java.util.Scanner;

public class O1Oppgave1{

 public static void main (String[] args){

    // Dette programmet gjør om tommer til centimeter
    Scanner in = new Scanner(System.in);

    System.out.println("Dette er et program som gjør om tommer til centimeter.");
    System.out.println("Skriv inn antall tommer: ");

    double inches = in.nextDouble(); 

    double centimeters = inches * 2.54;

    System.out.println(centimeters + "cm");



 }


}
