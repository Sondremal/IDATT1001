public class Oving2Oppgave2 {

    public static void main(String[] args) {

        /** A = 35,90kr for 450g. 
        *   B = 39,50kr for 500g
        *   Vi finner kiloprisen ved å dele på antall gram og gange med 1000g 
        */

        double merkeA = ((35.90 / 450) * 1000);
        double merkeB = ((39.50 / 500) * 1000);

        if (merkeA > merkeB) {
            System.out.println("Merke B er billigst med en kilopris på: " + merkeB
                    + "kr, mens merke A har kilopris på: " + merkeA + "kr.");
                    
        } else if (merkeB > merkeA) {
            System.out.println("Merke A er billigst med en kilopris på: " + merkeA
                    + "kr, mens merke B har kilopris på: " + merkeB + "kr.");

        } else {
            System.out.println("Merke A og B koster like mye, med en pris på: " + merkeA + "kr per kilo.");
        }
    }
}