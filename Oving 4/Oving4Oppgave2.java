import java.util.Scanner;

public class Oving4Oppgave2 {
    public static void main(String[] args) {
        int i = 1;
        int poengA = 0;
        int poengB = 0;
        Boolean spillet = false;
        Spiller A = new Spiller();
        Spiller B = new Spiller();
        
        Scanner in = new Scanner(System.in);

        System.out.println("Vil du starte terningspillet 100? (Y/N)");
        String starteSpillet = in.nextLine();
        if (starteSpillet.equalsIgnoreCase("Y")) {
            spillet = true;

        } 
        else {
            System.out.println("Avslutter spillet...");
            System.exit(0);

        }

        while (spillet) {
            A.kastTerningen(poengA);
            B.kastTerningen(poengB);

            if (A.getSumPoeng() == 100) {
                System.out.println(A.erFerdig("Spiller A"));
                spillet = false;

            } 
            else if (B.getSumPoeng() == 100) {
                System.out.println(B.erFerdig("Spiller B"));
                spillet = false;

            } 
            else {
                System.out.println("Runde: " + i + "\nSpiller A: " + A.getSumPoeng() + " poeng \nSpiller B: "
                        + B.getSumPoeng() + " poeng");
                System.out.println("------------------------------");
                poengA = A.getSumPoeng();
                poengB = B.getSumPoeng();
                i++;

            }

        }

    }
}
