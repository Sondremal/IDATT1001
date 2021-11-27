import java.util.Arrays;

public class Tekstanalyse {
    private String tekst;
    private int[] antallTegn = new int[30];
    private char[] alfabetet = new char[29];


    public Tekstanalyse(String tekst) {
        for(int i = 0; i < 26 ; i++){
            alfabetet[i] = (char)(97 + i); // a-z
        }
        alfabetet[26] = 230; //æ
        alfabetet[27] = 248; //ø
        alfabetet[28] = 229; //å

        this.tekst = tekst.toLowerCase();
        for (int i = 0; i < this.tekst.length(); i++) {
            for (int k = 0; k < 29; k++) {
                if (alfabetet[k] == this.tekst.charAt(i)) {
                    antallTegn[k]++;
                    break;
                }
            }
        }
        int sum = 0;
        for (int j = 0; j < 29; j++){
            sum += antallTegn[j];
        }
        antallTegn[29] = this.tekst.length() - sum;
    }


    public String getAntallTegn() {
        return Arrays.toString(antallTegn);
    }

    public String getTekst() {
        return this.tekst;
    }

    public int getForksjelligeBokstaver() {
        int forskjelligeBokstaver = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] >= 1) {
                forskjelligeBokstaver++;
            }
        }
        return forskjelligeBokstaver;
    }

    public int getAntallBokstaver() {
        int k = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            k += antallTegn[i];
        }
        return k;
    }

    public double getAntallTegnProsent() {
        double tegn = antallTegn[29];
        double sum = this.tekst.length();
        double antallTegnProsent = (tegn / sum) * 100;
        antallTegnProsent = Math.round(antallTegnProsent);
        return antallTegnProsent;
    }

    public int getAntallForekomst(char a) {
        int forekomst = 0;
        a = Character.toLowerCase(a);
        for (int i = 0; i < alfabetet.length; i++) {
            if (alfabetet[i] == a) {
                forekomst = antallTegn[i];
            }
        }
        return forekomst;
    }

    public String getOftestForekomst() {
        int max = 0;
        String bokstav = "";
        for (int i = 0; i < antallTegn.length - 1; i++) {
            if (antallTegn[i] > max) {
                max = antallTegn[i];
                bokstav = Character.toString(alfabetet[i]);
            } else if (antallTegn[i] == max) {
                bokstav += ", " + alfabetet[i];
            }
        }

        String resultat = "Bokstaven(e) som forekommer oftest er: " + bokstav + ". De(n) forekommer " + max + " ganger i teksten.";
        return resultat;
    }

}
