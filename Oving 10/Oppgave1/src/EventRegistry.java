import java.util.*;

/**
 * Klasse som brukes til å holde oversikt over alle arrangementer i et register, som også inneholder nyttige metoder.
 * Bruker java.util.ArrayList og Comparator
 * @author Sondre Malerud
 */
public class EventRegistry {
    int number;
    private final ArrayList<Event> eventRegistry;

    /**
     * Konstruktør som brukes til å lage et nytt, tomt arrangement-register
     */
    public EventRegistry() {
        this.eventRegistry = new ArrayList<>();
    }

    /**
     * Metode som brukes til registrere et nytt arrangement som legges til i registeret. Arrangement-nummer er unikt og
     * blir automatisk tildelt.
     * @param name er navnet på arrangementet
     * @param location er stedet til arrangementet
     * @param host er navnet på arrangøren
     * @param type er typen arrangement (bursdag, forelesning osv.)
     * @param time er tidspunktet til arrangementet (YYYYMMDDHHMM)
     */
    public void registerEvent(String name, String location, String host, String type, long time) {
        number++;
        eventRegistry.add(new Event(this.number, name, location, host, type, time));
    }

    /**
     * Metode som finner alle registrerte arrangementer på en spesifikk lokasjon
     * @param location er stedet som skal brukes til å finne arrangementene
     * @return et register over de arrangementene som fyller stedskravet
     */
    public ArrayList<Event> getEventsByLocation(String location) {
        ArrayList<Event> eventsByLocation = new ArrayList<>();
        for (Event e : this.eventRegistry) {
            if (e.getLocation().equalsIgnoreCase(location)) {
                eventsByLocation.add(e);
            }
        }
        if (eventsByLocation.isEmpty()) {
            return null;
        }
        return eventsByLocation;
    }

    /**
     * Metode som finner alle registrerte arrangementer på en spesifikk dato
     * @param date er datoen som skal brukes til å søke etter arrangementer (YYYYMMDD)
     * @return et register over de arrangementene som fyller kravet om datoen
     */
    public ArrayList<Event> getEventsByDate(int date) {
        ArrayList<Event> eventsByDate = new ArrayList<>();
        for (Event e : this.eventRegistry) {
            if ((e.getTime() / 10000) == date) {
                eventsByDate.add(e);
            }
        }
        if (eventsByDate.isEmpty()) {
            System.out.println("There are no registered events with " + date + " as their date.");
        }
        return eventsByDate;
    }

    /**
     * Metode som finner alle registrerte arrangementer innen et viss tidsintervall
     * @param fromDate er datoen som bestemmer nedereste tidsintervall (YYYYMMDD)
     * @param toDate er datoen som bestemmer øverste tidsintervall (YYYYMMDD)
     * @return et register over arrangementene som passer inne i tidsintervallet
     */
    public ArrayList<Event> getEventsByTimeInterval(int fromDate, int toDate) {
        ArrayList<Long> dates = new ArrayList<>();
        ArrayList<Event> eventsWithinInterval = new ArrayList<>();
        for (Event e : this.eventRegistry) {
            dates.add(e.getTime() / 10000);
        }
        dates.removeIf(e -> e < fromDate || e > toDate);
        if (dates.isEmpty()) {
            System.out.println("There are no registered events within the given time interval");
        }
        for (int i = 0; i < dates.size(); i++) {
            for (int j = 0; j < eventRegistry.size(); j++) {
                if ((this.eventRegistry.get(j).getTime() / 10000) - dates.get(i) == 0) {
                    eventsWithinInterval.add(eventRegistry.get(j));
                }
            }
        }
        return eventsWithinInterval;
    }

    /**
     * Metode som sorterer registeret alfabetisk med hensyn på sted
     * @return det sorterte registeret
     */
    public ArrayList<Event> getSortedByLocation() {
        Collections.sort(this.eventRegistry, compareLocation);
        return this.eventRegistry;
    }

    /**
     * Metode som sorterer registeret alfabetisk med hensyn på type
     * @return det sorterte registeret
     */
    public ArrayList<Event> getSortedByType() {
        Collections.sort(this.eventRegistry, compareType);
        return this.eventRegistry;
    }

    /**
     * Metode som sorterer registeret i stigende rekkefølge ut ifra datoen
     * @return det sorterte registeret
     */
    public ArrayList<Event> getSortedByTime() {
        Collections.sort(this.eventRegistry, compareTime);
        return this.eventRegistry;
    }

    /**
     * Comparator som brukes til å bestemme hvordan Collections.sort-metoden skal oppføre seg.
     * Her sammenlignes stedene i arrangementene, og returnerer -1, 0 eller 1 ut i fra restultatet
     */
    Comparator<Event> compareLocation = new Comparator<>() {
        public int compare(Event e1, Event e2) {
            return e1.getLocation().compareTo(e2.getLocation());
        }
    };

    /**
     * Comparator som brukes til å bestemme hvordan Collections.sort-metoden skal oppføre seg.
     * Her sammenlignes typene i arrangementene, og returnerer -1, 0 eller 1 ut i fra restultatet
     */
    Comparator<Event> compareType = new Comparator<>() {
        public int compare(Event e1, Event e2) {
            return e1.getType().compareTo(e2.getType());
        }
    };

    /**
     * Comparator som brukes til å bestemme hvordan Collections.sort-metoden skal oppføre seg.
     * Her sammenlignes datoene i arrangementene, og returnerer -1, 0 eller 1 ut i fra restultatet
     */
    Comparator<Event> compareTime = new Comparator<>() {
        public int compare(Event e1, Event e2) {
            if (e1.getTime() > e2.getTime()) {
                return 1;
            } else if (e1.getTime() < e2.getTime()) {
                return -1;
            } else return 0;
        }
    };
}
