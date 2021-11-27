import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];

        for (int i = 0; i < 5000; i++){
            int tall = random.nextInt(10);
            antall[tall]++;

        }
        System.out.println("Resultat:");
        for (int k = 0; k < 10; k++) {
            System.out.println(k + ": " + antall[k]);

        }
        // Eventuelt kan man få selve tabellen hvis det heller er ønskelig
        System.out.println(Arrays.toString(antall));
    }
}
