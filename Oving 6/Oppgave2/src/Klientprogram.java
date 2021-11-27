import java.util.Scanner;

public class Klientprogram {
    public static void main(String[] args) {
        boolean analyse = true;
        while (analyse) {
            Scanner tekstInput = new Scanner(System.in);

            System.out.println("Velkommen til tekstanalyseringsprogrammet. Skriv inn teksten du ønsker å analysere:");
            String tekst = tekstInput.nextLine();
            System.out.println("Antall forekomst av en bokstav vil bli analysert, skriv inn bokstaven du ønsker å sjekke:");
            char bokstav = tekstInput.nextLine().charAt(0);

            Tekstanalyse tekstanalyse = new Tekstanalyse(tekst);
            System.out.println("Antall forskjellige bokstaver: " + tekstanalyse.getForksjelligeBokstaver());
            System.out.println("Antall bokstaver totalt: " + tekstanalyse.getAntallBokstaver());
            System.out.println("Prosentandel tegn: " + tekstanalyse.getAntallTegnProsent() + "%");
            System.out.println("Antall forekomst av bokstaven '" + bokstav + "': " + tekstanalyse.getAntallForekomst(bokstav));
            System.out.println(tekstanalyse.getOftestForekomst());

            System.out.println("Vil du prøve en annen tekst? (Y/N)");
            char provIgjen = tekstInput.nextLine().charAt(0);
            if (Character.toLowerCase(provIgjen) == 'n') {
                System.out.println("Programmet avsluttes...");
                analyse = false;

            }
        }
    }
}
