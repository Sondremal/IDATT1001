public class Valuta2 {
    // 1.0 usd = 8.71 nok, 1.0 eur = 10.29 nok, 1.0 sek = 1.01 nok
    private String valuta;
    private double verdi;

    private void valVerdi(double verdi){
    if (verdi == 1){
        this.verdi = 8.71;
        valuta = "dollar";
    }
    else if (verdi == 2){
        this.verdi = 10.29;
        valuta = "euro";
    }
    else {
        this.verdi = 1.01;
        valuta = "svenske kroner";
    }
    }
    

    public String fraNorskeKroner(double penger, int verdi) {
        Valuta2 valuta = new Valuta2();
        valuta.valVerdi(verdi);
        double nyVerdi = penger / this.verdi;
        String konvertert = penger + " nok = " + nyVerdi + " " + this.valuta; 
        return konvertert;
    }

    public String tilNorskeKroner(double penger, int verdi) {
        Valuta2 valuta = new Valuta2();
        valuta.valVerdi(verdi);
        double nyVerdi = penger * this.verdi;
        String konvertert = penger + " " + this.valuta + " = " + nyVerdi + " nok";
        return konvertert;
    }
}
