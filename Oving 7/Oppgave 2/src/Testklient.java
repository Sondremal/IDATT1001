import java.util.Objects;

public class Testklient {
    public static void main(String[] args) {
        System.out.println("Antall tester: 6");
        String tekst1 = "Hei, dette er en test. Det skal være tre setninger av forskjellige lengder med æøå inkludert. Test skrevet."; // antall ord i rekkefølge: 5, 11, 2
        String tekst1Stor = "HEI, DETTE ER EN TEST. DET SKAL VÆRE TRE SETNINGER AV FORSKJELLIGE LENGDER MED ÆØÅ INKLUDERT. TEST SKREVET.";
        String tekst2 = "Kortere setning til gjennomsnittstesting."; //ord-lengde i rekkefølge: 7, 7, 3, 20
        String tekst2Skifte = "Kortere setning til ordskifte-testing.";


        Tekstbehandling t1 = new Tekstbehandling(tekst1);
        Tekstbehandling t2 = new Tekstbehandling(tekst2);

        if (t1.getAntallOrd() == 18){
            System.out.println("Test 1 suksessfull.");
        } else {
            System.out.println("Test 1 feilet.");
        }

        if (t2.getGjennomsnittslengde() == 9.25){
            System.out.println("Test 2 suksessfull.");
        } else{
            System.out.println("Test 2 feilet.");
        }

        if (t1.getGjennomsnittligOrdPeriode() == 6.0){
            System.out.println("Test 3 suksessfull.");
        } else{
            System.out.println("Test 3 feilet.");
        }

        if (tekst1.equals(t1.getTekst())){
            System.out.println("Test 4 suksessfull.");
        } else{
            System.out.println("Test 4 feilet.");
        }

        if (tekst1Stor.equals(t1.getTekstStor())){
            System.out.println("Test 5 suksessfull.");
        } else{
            System.out.println("Test 5 feilet.");
        }

        t2.skifteOrd("gjennomsnittstesting", "ordskifte-testing");
        if (tekst2Skifte.equals(t2.getTekst())){
            System.out.println("Test 6 suksessfull.");
        }
        else{
            System.out.println("Test 6 feilet");
        }

        }
    }

