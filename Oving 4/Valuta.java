public class Valuta {
    // 1.0 usd = 8.71 nok, 1.0 eur = 10.29 nok, 1.0 sek = 1.01 nok
    private String valuta;
    private double verdi;


    public String fraNorskeKroner(double penger, int verdi) {
        if (verdi == 1){
            this.verdi = 8.71;
            this.valuta = "dollar";
        }
        else if (verdi == 2){
            this.verdi = 10.29;
            this.valuta = "euro";
        }
        else {
            this.verdi = 1.01;
            this.valuta = "svenske kroner";
        }
        
        double nyVerdi = penger / this.verdi;
        String konvertert = penger + " nok = " + nyVerdi + " " + this.valuta; 
        return konvertert;
    }

    public String tilNorskeKroner(double penger, int verdi) {
        if (verdi == 1){
            this.verdi = 8.71;
            this.valuta = "dollar";
        }
        else if (verdi == 2){
            this.verdi = 10.29;
            this.valuta = "euro";
        }
        else {
            this.verdi = 1.01;
            this.valuta = "svenske kroner";
        }

        double nyVerdi = penger * this.verdi;
        String konvertert = penger + " " + this.valuta + " = " + nyVerdi + " nok";
        return konvertert;
    }
}
