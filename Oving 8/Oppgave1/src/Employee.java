
import java.util.GregorianCalendar;


public class Employee {
    private final Person personalia; // includes: firstname, lastname, birthyear
    private final int employeeNumber;
    private final int employmentYear;
    private double salary;
    private double taxPercent;

    private final GregorianCalendar calendar = new GregorianCalendar();
    int year = calendar.get(GregorianCalendar.YEAR);

    /**
     *
     * @param personalia
     * @param employeeNumber
     * @param employmentYear
     * @param salary
     * @param taxPercent
     */
    public Employee(Person personalia, int employeeNumber, int employmentYear, double salary, double taxPercent) {
        this.personalia = personalia;
        this.employeeNumber = employeeNumber;
        this.employmentYear = employmentYear;
        this.salary = salary;
        this.taxPercent = taxPercent;
    }

    /**
     *
     * @return
     */
    public double getTaxPerMonth(){
        return (this.salary / 100) * this.taxPercent;
    }

    public double getGrossSalary(){
        return this.salary * 12;
    }

    public double getTaxPerYear(){
        return (getTaxPerMonth() * 10) + (getTaxPerMonth() / 2);
    }

    public String getFullName(){
        return personalia.getLastName() + ", " + personalia.getFirstName();
    }

    public int getAge(){
        return this.year - personalia.getBirthYear();
    }

    public int getYearsEmployed(){
        return this.year - this.employmentYear;
    }

    public boolean minYearsEmployed(int year){
        return getYearsEmployed() >= year;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public String toString() {
        return getPersonalia() +
                "\nemployee number = " + getEmployeeNumber() +
                "\nemployment year = " + getEmploymentYear() +
                "\nsalary = " + getSalary() +
                "\ntax percentage = " + getTaxPercent() + "%" +
                "\ntax per month = " + getTaxPerMonth() +
                "\ngross salary per year = " + getGrossSalary() +
                "\ntotal tax per year = " + getTaxPerYear() +
                "\nfull name = " + getFullName() +
                "\nage = " + getAge() +
                "\nyears employed = " + getYearsEmployed();
    }
}
