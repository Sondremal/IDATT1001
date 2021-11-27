import java.util.Scanner;

public class Oving3Oppgave1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int multPerTable = 0;
        int j = 1;

        System.out.println("Hello! This program will show you a part of any multiplication table.");
        while (true) {

            try {
                System.out.println("Which multiplication table do you want to start with?");
                start = in.nextInt();

                System.out.println("Which multiplication table do you want to end with?");
                end = in.nextInt();

                if (end < start) {
                    System.out.println("Your end table is of a lower number than your start table! Try again.");
                    continue;
                }

                System.out.println("How many multiplications do you want per table?");
                multPerTable = in.nextInt();

                if (multPerTable <= 0) {
                    System.out.println("This is not a valid number of multiplications! Try again.");
                    continue;
                }

                break;

            } catch (Exception e) {
                System.err.println("You did not enter a whole number.");
                in.next();
            }
        }
        int i = ((end - start) + 1);

        // 'j' bestemmer hvilken tabell som skrives ut, 'i' bestemmer hvor mange
        // tabeller som totalt skal skrives ut
        while (j <= i) {
            System.out.println("\n" + start + " times table:");
            // 'g' er antall regnestykker, mens 'multPerTable' er totalt antall regnestykker
            // per tabell
            int g = 1;

            while (g <= multPerTable) {
                System.out.println(start + " x " + g + " = " + start * g);
                g++;

            }

            start++;
            j++;
        }

    }

}
