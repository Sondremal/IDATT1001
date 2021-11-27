import java.util.ArrayList;

/**
 * En klasse som lagrer menyer i form av matrett-lister.
 * Bruker java.util.ArrayList
 * @author Sondre Malerud
 */
public class Menu {
    private final ArrayList<Dish> menu;

    /**
     * Konstruktør som brukes til å registrere menyen
     * @param menu er menyen som skal registreres, og må bestå av alle matrettene som skal være i menyen
     */
    public Menu(ArrayList<Dish> menu){
        this.menu = menu;
    }

    /**
     * En metode som gir den totale summen av matrettenes priser ved å gå gjennom hver matrett i menyen og bruke getPrice().
     * @return total sum av prisen til matrettene
     */
    public double getTotalPrice(){
        double total = 0;
        for (Dish d : this.menu){
            total += d.getPrice();
        }
        return total;
    }


    /**
     * En tekststreng som viser innholdet i menyen da de blir kallt.
     * @return streng med alle matrettene i menyen.
     */
    @Override
    public String toString() {
        String s = "";
        for (Dish d : menu){
            s += d.getName() + ", ";
        }

        return s + "\n" ;
    }
}
