import java.util.Arrays;

// Holder oversikt over hvor mange oppgaver hver enkelt student har fått godkjent
public class AssignmentOverview {
    private Student[] students;
    private int studentAmount = 0;

    /**
     * Konstruktør til klassen, som lager ny Student-tabell etter å øke antall studenter med 1.
     *
     * @param student er objektet av Student-klassen som skal legges inn i tabellen.
     */
    public AssignmentOverview(Student student){
        this.studentAmount += 1;
        this.students = new Student[studentAmount];
        this.students[studentAmount - 1] = student;
    }

    /**
     *
     * @return antall studenter registrert.
     */
    public int getStudentAmount(){
        return this.studentAmount;
    }

    /**
     * Henter antall godkjente oppgaver til en spesifikk student ut i fra dens registrerte navn.
     *
     * @param name er navnet til studenten, som brukes til å sammenligne med getName()-metoden til studentene i for-løkka.
     * @return gir tilbake tekststreng med antall godkjente oppgaver til den bestemte studenten. Dersom studenten ikke
     * er registrert, returnerer den en alternativ streng som sier dette.
     */
    public String getAssignmentAmount(String name){
        for (Student s : students){
            if (name.equalsIgnoreCase(s.getName())){
                return s.getName() + " has completed " + s.getAssignmentAmount() + " assignments.";
            }
        }
        return "This student is not yet registered.";
    }

    /**
     * Denne metoden brukest til å registrere en ny student, som legges til i en ny oppdatert tabell, etter å ha tatt
     * dyp kopi av den forrige.
     *
     * @param student er objektet av klassen Student som legges inn i siste index av den nye tabellen
     */
    public void registerNewStudent(Student student){
        for (Student s : students){
            if (s.getName().equalsIgnoreCase(student.getName())){
                System.out.println("This name is already registered.");
            } else{
                this.studentAmount += 1;
                Student[] newStudents = new Student[studentAmount];
                for (int i = 0; i < studentAmount - 1; i++){
                    newStudents[i] = new Student(students[i].getName(), students[i].getAssignmentAmount());
                }
                newStudents[studentAmount - 1] = student;
                this.students = newStudents;
            }
            break;
        }
    }

    /**
     * Metode som øker antall godkjente oppgaver til en bestemt student.
     *
     * @param name er navnet til studenten, som brukes til å sammenligne med getName()-metoden til studentene i for-løkka.
     * @param increase er tallet som bestemmer hvor mange ekstra oppgaver som skal legges til i studentens godkjente.
     */
    public void increaseAssignmentsFor(String name, int increase) {
        name = name.toLowerCase();
        for (Student s : students) {
            if (name.equals(s.getName().toLowerCase())) {
                s.incrAssignmentAmount(increase);
            }
        }
    }

    /**
     * En forenklet toString()-metode som bare returnerer tabellen. Dette er hjelpsomt dersom man skal ha oversikt over
     * hvilke studenter som er reigstrert, og ikke bryr seg om det nøyaktige antallet.
     *
     * @return Den mest oppdaterte Student-tabellen med en Arrays.toString()-metode som gjør at den er leselig i klienten.
     */
    public String getStudentArray(){
        return "Students: " + Arrays.toString(students);
    }

    @Override
    public String toString() {
        return "AssignmentOverview {" +
                "students = " + Arrays.toString(students) +
                ", studentAmount = " + studentAmount +
                '}';
    }
}
