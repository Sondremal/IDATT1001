import java.util.Scanner;

public class Oving3Oppgave2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        String tryAgain;

        System.out.println("This program will figure out if a number is a prime or not.");

        do {
            boolean prime = true;
            System.out.println("Please enter a number.");

            try {
                number = scan.nextInt();

                // Sjekker om tallene lavere enn 'number' er faktorer i tallet.
                int increasingNumber = 2;
                while (increasingNumber <= number / 2) {
                    if (number % increasingNumber == 0) {
                        prime = false;
                        break;
                    }
                    increasingNumber++;
                }
                if (prime) {

                    System.out.println(number + " is a prime.");

                } else {

                    System.out.println(number + " is not a prime.");

                }

            } catch (Exception e) {
                System.err.println("You did not enter a number.");
                scan.next();
            }
            System.out.println("Do you want to check another number? (Y/N) ");
            tryAgain = scan.next();


        } while (tryAgain.equalsIgnoreCase("Y"));
    }
}
