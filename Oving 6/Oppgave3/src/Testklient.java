import java.util.Scanner;
public class Testklient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Velkommen til matriseprogrammet. Først lager vi to matriser.");
        System.out.println("Hvor mange rader skal den første matrisen ha?");
        int rader1 = scan.nextInt();
        System.out.println("Hvor mange kolonner skal den første matrisen ha?");
        int kolonner1 = scan.nextInt();
        Matrise m1 = new Matrise(rader1, kolonner1);

        System.out.println("Hvor mange rader skal den andre matrisen ha?");
        int rader2 = scan.nextInt();
        System.out.println("Hvor mange kolonner skal den andre matrisen ha?");
        int kolonner2 = scan.nextInt();
        Matrise m2 = new Matrise(rader2, kolonner2);
        System.out.println("Matrise 1: " + m1.getMatrise() + "\nMatrise 2: " + m2.getMatrise());

        System.out.println("Hva vil du gjøre?\n1. Addere matrisene\n2. Multiplisere matrisene\n3. Transponere matrise\n4. Avslutt");
        int valg = scan.nextInt();

        switch (valg) {
            case 1:
                System.out.println("Matrise 1 + Matrise 2 = " + m1.addere(m2));
                break;

            case 2:
                System.out.println("Matrise 1 * Matrise 2 = " + m1.multiplisere(m2));
                break;

            case 3:
                System.out.println("Hvilken matrise vil du transponere?\n1. Matrise 1\n2. Matrise 2");
                int valg2 = scan.nextInt();
                if (valg2 == 1){
                    System.out.println("Matrise før transponering: " + m1.getMatrise());
                    System.out.println("Matrise 1 transponert = " + m1.transponere());
                }else{
                    System.out.println("Matrise før transponering: " + m2.getMatrise());
                    System.out.println("Matrise 2 transponert = " + m2.transponere());
                }
                break;

            case 4:
                System.out.println("Avslutter programmet...");
                System.exit(0);

        }
    }
}
