import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean showMenu = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter:\nFirst name");
        String firstName = scan.nextLine();
        System.out.println("Last name");
        String lastName = scan.nextLine();
        System.out.println("Birth year");
        int birthYear = scan.nextInt();
        Person person = new Person(firstName, lastName, birthYear);

        System.out.println("Employee number");
        int employeeNumber = scan.nextInt();
        System.out.println("Employment year");
        int employmentYear = scan.nextInt();
        System.out.println("Salary");
        double salary = scan.nextDouble();
        System.out.println("Tax percentage");
        double taxPercentage = scan.nextDouble();
        Employee employee = new Employee(person, employeeNumber, employmentYear, salary, taxPercentage);
        System.out.println("Calling all get-methods...");
        System.out.println(employee);

        while (showMenu) {
            scan = new Scanner(System.in);

            System.out.println("What do you want to do next?\n1: Change salary\n2: Change tax percentage\n3: Check minimum years employed\n4: Exit program");
            int menuChoice = scan.nextInt();
            if (menuChoice == 1) {
                System.out.println("Enter updated salary:");
                double updatedSalary = scan.nextDouble();
                employee.setSalary(updatedSalary);
                System.out.println("Calling all get-methods...");
                System.out.println(employee);

            } else if (menuChoice == 2) {
                System.out.println("Enter updated tax:");
                double updatedTax = scan.nextDouble();
                employee.setTaxPercent(updatedTax);
                System.out.println("Calling all get-methods...");
                System.out.println(employee);

            } else if (menuChoice == 3) {
                System.out.println("Enter the minimum of years employed");
                int minYearsEmployed = scan.nextInt();
                if (employee.minYearsEmployed(minYearsEmployed)){
                    System.out.println(employee.getFullName() + " has been employed for " + minYearsEmployed + " years or longer.");
                }else{
                    System.out.println(employee.getFullName() + " has not been employed for " + minYearsEmployed + " years or longer.");
                }
            }
            else{
                showMenu = false;
            }
        }
        System.out.println("Exiting program...");
    }
}
