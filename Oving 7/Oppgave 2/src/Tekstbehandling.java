/**
 * The type Tekstbehandling.
 */
public class Tekstbehandling {

    private String tekst;
    private String[] teksttabell;

    /**
     * Constructor for tekstbehandling
     *
     * @param tekst is the text
     */
    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
        this.teksttabell = tekst.split(" ");
    }


    /**
     * Gets antall ord.
     *
     * @return the antall ord
     */
    public int getAntallOrd() {
        int antallOrd = 0;
        for (String ord : this.teksttabell) {
            antallOrd++;
        }
        return antallOrd;
    }

    /**
     * Gets gjennomsnittslengde.
     *
     * @return the gjennomsnittslengde
     */
    public double getGjennomsnittslengde() {
        String tekstUtenTegn = "";
        for (String ord : this.teksttabell) {
            tekstUtenTegn += ord;
        }
        tekstUtenTegn = tekstUtenTegn.replaceAll("[.,_!/()?+)-]", "");

        double gjennomsnittslengde = Math.round(((double)tekstUtenTegn.length() / (double)getAntallOrd()) * 100.0) / 100.0;
        return gjennomsnittslengde;
    }

    /**
     * Gets gjennomsnittlig ord periode.
     *
     * @return the gjennomsnittlig ord periode
     */
    public double getGjennomsnittligOrdPeriode() {
        double antallPerioder = this.tekst.split("[.!:?]").length;
        double antallOrd = getAntallOrd();
        double gjennomsnitt = antallOrd / antallPerioder;
        return Math.round(gjennomsnitt * 100.0) / 100.0;
    }

    /**
     * Skifte ord.
     *
     * @param ord1 the ord 1
     * @param ord2 the ord 2
     */
    public void skifteOrd(String ord1, String ord2) {
        this.tekst = this.tekst.replaceAll(ord1, ord2);
    }

    /**
     * Gets tekst.
     *
     * @return the tekst
     */
    public String getTekst() {
        return this.tekst;
    }

    /**
     * Gets tekst stor.
     *
     * @return the tekst stor
     */
    public String getTekstStor() {
        String tekstStor = this.tekst.toUpperCase();
        return tekstStor;
    }

}
