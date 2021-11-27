import java.util.Scanner;

public class Oving2Oppgave1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("This is a program that helps you figure out if a year is a leap year.");
        System.out.println("Please enter a year: ");

        int year = in.nextInt();

        /* Her sjekker den om året kan deles på 4, men passer også på at det ikke kan
         deles på 100. ELLER om det kan deles på 400. */
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0))) {

            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

}
