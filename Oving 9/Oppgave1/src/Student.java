public class Student {
    private final String name;
    private int assignmentAmount;

    /**
     * Konstruktør som registrerer studenten ved å oppdatere navnet og antall godkjente oppgaver.
     *
     * @param name er navnet til studenten
     * @param assignmentAmount er antall oppgaver studenten har fått godkjent
     */
    public Student(String name, int assignmentAmount){
        this.name = name;
        this.assignmentAmount = assignmentAmount;
    }

    /**
     * @return navnet til studenten
     */
    public String getName(){
        return name;
    }

    /**
     * @return antall godkjente oppgaver til studenten.
     */
    public int getAssignmentAmount(){
        return assignmentAmount;
    }

    /**
     * Metode som øker antall godkjente oppgaver til en student
     *
     * @param increase bestemmer hvor mange godkjente oppgaver som skal legges til.
     */
    public void incrAssignmentAmount(int increase){
        assignmentAmount += increase;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", assignmentAmount=" + assignmentAmount +
                '}';
    }
}
