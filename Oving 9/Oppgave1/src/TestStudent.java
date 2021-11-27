public class TestStudent {
    public static void main(String[] args) {
    Student student = new Student("Sondre", 5);

    System.out.println(student.getAssignmentAmount());
    System.out.println(student.getName());
    System.out.println(student.toString());
    student.incrAssignmentAmount(4);
    System.out.println(student.getAssignmentAmount());
    student.incrAssignmentAmount(-2);
    System.out.println(student.getAssignmentAmount());

    }
}
