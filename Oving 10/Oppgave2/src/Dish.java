/**
 * En klasse som lagrer matretter og passende attributter
 * @author Sondre Malerud
 */
public class Dish {
    private final String name;
    private final String type; // appetizer, main course, dessert etc.
    private double price;
    private final String recipe;

    /**
     * Konstruktør som brukes til å opprette et nytt objekt av matretten
     * @param name er navnet på retten
     * @param type er typen rett (forrett, hovvedrett, dessert osv.)
     * @param price er hvor mye retten koster
     * @param recipe er oppskriften til retten
     */
    public Dish(String name, String type, double price, String recipe) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    /**
     *
     * @return navnet til matretten
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return typen matrett (forrett, hovedrett, dessert osv.)
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return prisen på matretten
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price er prisen på matretten
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return oppskriften til matretten
     */
    public String getRecipe() {
        return recipe;
    }

    /**
     * Returnerer en oversiktlig tekststreng med det man vanligvis ønsker å se når man henter en matrett inn i programmet.
     * @return streng med navn, type, pris og oppskrift
     */
    @Override
    public String toString() {
        return this.name + ": (" + this.type + ", $" + this.price + ", recipe: " + this.recipe + ")\n";
    }
}
