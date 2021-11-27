import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the assignment overview program. Please enter the first student's name: ");
        String name = scan.nextLine();
        System.out.println("Enter the amount of assignments " + name + " has completed: ");
        int assignments = scan.nextInt();
        Student student = new Student(name, assignments);
        AssignmentOverview a = new AssignmentOverview(student);

        boolean showMenu = true;
        while(showMenu){
            System.out.println("What do you want to do next?\n" +
                    "1. Get amount of students registered.\n" +
                    "2. Get amount of assignments done by a specific student.\n" +
                    "3. Register a new student.\n" +
                    "4. Increase completed assignments for a specific student.\n" +
                    "5. Exit program.");
            int menuInput = scan.nextInt();
            scan = new Scanner(System.in);
            switch (menuInput){
                case 1:
                    System.out.println(a.getStudentAmount() + " student(s) is/are registered.");
                    break;
                case 2:
                    System.out.println("Enter the name of the student you want to check:");
                    name = scan.nextLine();
                    System.out.println(a.getAssignmentAmount(name));
                    break;
                case 3:
                    System.out.println("Please enter the name of the student you want to register: ");
                    name = scan.nextLine();
                    System.out.println("Enter the amount of assignments " + name + " has completed.");
                    assignments = scan.nextInt();
                    Student newStudent = new Student(name, assignments);
                    a.registerNewStudent(newStudent);
                    System.out.println("Student registered. Here are the current list of registered students: ");
                    System.out.println(a.getStudentArray());
                    break;
                case 4:
                    System.out.println("Enter the name of the student you want to increase the amount of completed assignments for: ");
                    name = scan.nextLine();
                    System.out.println(a.getAssignmentAmount(name) + " How many assignments do you want to increase by?");
                    int increase = scan.nextInt();
                    a.increaseAssignmentsFor(name, increase);
                    System.out.println(a.getAssignmentAmount(name));
                    break;
                case 5:
                    showMenu = false;
                    }
            }
        System.out.println("Closing program...");
        System.exit(0);
        }
        }


