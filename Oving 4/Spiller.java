import java.util.Random;

public class Spiller {

    private int sumPoeng;
    private Random terning = new Random(); // vi lager en tilfeldig tallgenerator


    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen(int sumPoeng) {
        int nySum = sumPoeng;
        int terningkast = terning.nextInt(6) + 1;
        if (terningkast == 1) {
            nySum = 0;
        } else if (sumPoeng > 100) {
            nySum -= terningkast;
        } else {
            nySum += terningkast;
        }
        this.sumPoeng = nySum;
    }

    public String erFerdig(String spiller) {
        String Ferdig = spiller + " har vunnet!";
        return Ferdig;
    }

}
