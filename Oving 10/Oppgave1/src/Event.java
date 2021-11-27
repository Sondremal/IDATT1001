/**
 * Klasse som brukes til å lage et arrangement og knytter relevante attributter til det
 * @author Sondre Malerud
 */
public class Event {
    private final int number;
    private final String name;
    private final String location;
    private final String host;
    private final String type;
    private final long time;

    /**
     * Konstruktør som brukes til å registrere arrangementet. Parameteret bestemmer informasjonen som skal knyttes til arrangementet.
     * @param number er et nummer som brukes til å identifisere arrangementet
     * @param name er navnet til selve arrangementet
     * @param location er hvilket sted arrangementet tar plass
     * @param host er hvem som arrangerer arrangementet
     * @param type er hvilken type arrangement det er (forelesning, bursdag, osv.)
     * @param time er datoen og tidspunktet arrangementet finner sted (YYYYMMDDHHMM)
     */
    public Event(int number, String name, String location, String host, String type, long time) {
        this.name = name;
        this.location = location;
        this.host = host;
        this.type = type;
        this.time = time;
        this.number = number;
    }

    /**
     *
     * @return nummeret som identifiserer arrangementet
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return navnet på arrangementet
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return stedet arrangementet holdes
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @return hvem som arrangerer arrangementet
     */
    public String getHost() {
        return host;
    }

    /**
     *
     * @return typen arrangement (bursdag, forelesning osv.)
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return datoen og tidspunktet arrangementet finner sted (YYYYMMDDHHMM)
     */
    public long getTime() {
        return time;
    }


    /**
     * Metode som gjør det mer oversiktlig å hente inn Event-objektet som tekststreng
     * @return relevant info om arrangementet på oversiktlig måte. Returnerer nummeret, navnet, plasseringen,
     * arrangøren, typen og tidspunktet arrangementet finner sted
     */
    @Override
    public String toString() {
        return "Event " + number +
                ": name: " + name +
                ", location: " + location +
                ", host: " + host +
                ", type: " + type +
                ", date: " + time;
    }
}