import java.util.Arrays;
import java.util.Scanner;

public final class Matrise {
    private final double[][] matrise;
    private final int rader;
    private final int kolonner;
    Scanner scan = new Scanner(System.in);

    private Matrise(double[][] matrise){
        this.matrise = matrise;
    }
    public String getMatrise() {
        return Arrays.deepToString(this.matrise);
    }

    public int getRader() {
        return rader;
    }

    public int getKolonner() {
        return kolonner;
    }

    public Matrise(int rader, int kolonner){
        this.rader = rader;
        this.kolonner = kolonner;
        double[][] matrise = new double[rader][kolonner];
        System.out.println("Fyll matrisen:");
        for (int i = 0; i < rader; i++){
            for (int j = 0; j < kolonner; j++){
                System.out.println("[" + i + "] [" + j + "]");
                matrise[i][j] = scan.nextDouble();
            }
        }
        this.matrise = matrise;
    }

    public String addere(Matrise y){
        int rader = getRader();
        int kolonner = getKolonner();
        int yRader = y.getRader();
        int yKolonner = y.getKolonner();

        if (rader != yRader || kolonner != yKolonner){
            return null;
        }
        for (int i = 0; i < rader; i++){
            for (int j = 0; j < kolonner; j++){
                this.matrise[i][j] += y.matrise[i][j];
            }
        }
        return getMatrise();
    }


    public String multiplisere(Matrise y){
        int rader = getRader();
        int kolonner = getKolonner();
        int yRader = y.getRader();
        int yKolonner = y.getKolonner();

        if (kolonner != yRader){
            return null;
        }
        double[][] matrise = new double[rader][yKolonner];
        for (int i = 0; i < yKolonner; i++){
            for (int j = 0; j < rader; j++){
                for (int k = 0; k < kolonner; k++){
                    matrise[j][i] += this.matrise[j][k] * y.matrise[k][i];
                }
            }
        }
        new Matrise(matrise);
        return getMatrise();
    }


    public String transponere(){
        int rader = getRader();
        int kolonner = getKolonner();

        double[][] matrise = new double[kolonner][rader];
        for (int i = 0; i < rader; i++){
            for (int j = 0; j < kolonner; j++){
                matrise[j][i] += this.matrise[i][j];
            }
        }
        new Matrise(matrise);
        return getMatrise();
    }
}



