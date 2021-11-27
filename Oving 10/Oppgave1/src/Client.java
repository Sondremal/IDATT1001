import java.util.Scanner;

public class Client {
    static Scanner scan = new Scanner(System.in);
    static EventRegistry eventReg = new EventRegistry();

    public static void main(String[] args) {
        System.out.println("This program will help you register events and keep an overview of all current " +
                "registered ones. First you have to register an event.");
        createEvent();
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("What do you want to do next?\n" +
                    "1. Register an event\n" +
                    "2. Show all events registered at a specific location\n" +
                    "3. Show all events registered at a specific date\n" +
                    "4. Show all events registered within a specified time interval\n" +
                    "5. Show a list of events, sorted by location\n" +
                    "6. Show a list of events, sorted by type\n" +
                    "7. Show a list of events, sorted by time\n" +
                    "8. Exit program");
            int menuInput = scan.nextInt();

            switch (menuInput) {
                case 1:
                    createEvent();
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Which location?");
                    String location = scan.nextLine();
                    System.out.println(eventReg.getEventsByLocation(location));
                    break;
                case 3:
                    System.out.println("Which date? (YYYYMMDD)");
                    int date = scan.nextInt();
                    System.out.println(eventReg.getEventsByDate(date));
                    break;
                case 4:
                    System.out.println("From which date? (YYYYMMDD)");
                    int fromDate = scan.nextInt();
                    System.out.println("Until which date? (YYYYMMDD)");
                    int toDate = scan.nextInt();
                    System.out.println(eventReg.getEventsByTimeInterval(fromDate, toDate));
                    break;
                case 5:
                    System.out.println(eventReg.getSortedByLocation());
                    break;
                case 6:
                    System.out.println(eventReg.getSortedByType());
                    break;
                case 7:
                    System.out.println(eventReg.getSortedByTime());
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("You did not enter a number between 1-8.");
                    break;
            }
        }

    }

    static void createEvent() {
        scan = new Scanner(System.in);
        System.out.println("Enter the name of the event:");
        String name = scan.nextLine();
        System.out.println("Enter the location:");
        String location = scan.nextLine();
        System.out.println("Enter the name of the host:");
        String host = scan.nextLine();
        System.out.println("Enter the type of event (concert, theatre, lecture etc.):");
        String type = scan.nextLine();
        System.out.println("At what time will the event start? (YYYYMMDDHHMM)");
        long time = scan.nextLong();
        eventReg.registerEvent(name, location, host, type, time);
    }

}
