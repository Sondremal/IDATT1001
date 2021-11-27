package Oppgave2;
import java.util.Random;

public class MinRandom {

    private Random rng;

    public MinRandom(){
        rng = new Random();
    }

    // Tilfeldig heltall fra nedre(inkludert) til ovre(ekskludert)
    public int nesteHeltall(int nedre, int ovre) {
        int randomMax = ovre - nedre;
        int randomInt = rng.nextInt(randomMax);
        int result = randomInt + nedre;
        return result;
    }

    // Tilfeldig desimaltall fra nedre(inkludert) til ovre(ekskludert)
    public double nesteDesimaltall(double nedre, double ovre) {
        double randomDouble = rng.nextDouble();    
        double result =  nedre + (ovre - nedre) * randomDouble;
        return result;
    }
}