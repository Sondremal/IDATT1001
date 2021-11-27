package Oppgave2;

public class Testklient {
    public static void main(String[] args) {
        MinRandom random = new MinRandom();

        // Tester mange heltall 
        for (int i = 0; i < 10; i++){
            System.out.println(random.nesteHeltall(-10, 10));
        }

        // Tester mange desimaltall
        for (int i = 0; i < 10; i++){
            System.out.println(random.nesteDesimaltall(-4.5, 7.672));
        }
    }
}
