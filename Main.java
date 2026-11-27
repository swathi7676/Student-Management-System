
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Enter / Update Marks");
            System.out.println("4. Calculate Total");
            System.out.println("5. Calculate Average");
            System.out.println("6. Calculate Grade");
            System.out.println("7. Pass / Fail");
            System.out.println("8. Search Student by ID");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {


                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();


                    boolean exists = false;

                    for (Student s : students) {

                        if (s.getStudentId() == id) {
                            exists = true;
                            break;
                        }

                    }

                    if (exists) {

                        System.out.println("Student ID already exists!");

                    }
                    else {

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        Student s1 = new Student(id, name, department);

                        students.add(s1);

                        System.out.println("Student Added Successfully!");

                    }

                    break;


                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No Students Available!");

                    }
                    else {

                        for (Student s : students) {

                            s.displayStudent();

                        }

                    }

                    break;


                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student found = null;

                    for (Student s : students) {

                        if (s.getStudentId() == searchId) {

                            found = s;
                            break;

                        }

                    }

                    if (found != null) {

                        System.out.print("Enter Subject 1 Marks: ");
                        int m1 = sc.nextInt();

                        System.out.print("Enter Subject 2 Marks: ");
                        int m2 = sc.nextInt();

                        System.out.print("Enter Subject 3 Marks: ");
                        int m3 = sc.nextInt();

                        found.setMarks(m1, m2, m3);

                    }
                    else {

                        System.out.println("Student Not Found!");

                    }

                    break;


                case 4:

                    System.out.print("Enter Student ID: ");
                    searchId = sc.nextInt();

                    found = findStudent(students, searchId);

                    if (found != null && found.hasMarks()) {

                        System.out.println("Total Marks: " + found.calculateTotal());

                    }
                    else {

                        System.out.println("Student not found or marks not entered!");

                    }

                    break;


                case 5:

                    System.out.print("Enter Student ID: ");
                    searchId = sc.nextInt();

                    found = findStudent(students, searchId);

                    if (found != null && found.hasMarks()) {

                        System.out.println("Average: " + found.calculateAverage());

                    }
                    else {

                        System.out.println("Student not found or marks not entered!");

                    }

                    break;


                case 6:

                    System.out.print("Enter Student ID: ");
                    searchId = sc.nextInt();

                    found = findStudent(students, searchId);

                    if (found != null && found.hasMarks()) {

                        System.out.println("Grade: " + found.calculateGrade());

                    }
                    else {

                        System.out.println("Student not found or marks not entered!");

                    }

                    break;


                case 7:

                    System.out.print("Enter Student ID: ");
                    searchId = sc.nextInt();

                    found = findStudent(students, searchId);

                    if (found != null && found.hasMarks()) {

                        System.out.println("Result: " + found.calculateResult());

                    }
                    else {

                        System.out.println("Student not found or marks not entered!");

                    }

                    break;


                case 8:

                    System.out.print("Enter Student ID: ");
                    searchId = sc.nextInt();

                    found = findStudent(students, searchId);

                    if (found != null) {

                        found.displayStudent();

                    }
                    else {

                        System.out.println("Student Not Found!");

                    }

                    break;


                case 9:

                    System.out.println("Thank You! Application Closed.");

                    break;

                default:

                    System.out.println("Invalid Choice! Try Again.");

            }

        } while (choice != 9);

        sc.close();

    }


    public static Student findStudent(ArrayList<Student> students, int id) {

        for (Student s : students) {

            if (s.getStudentId() == id) {

                return s;

            }

        }

        return null;

    }

}
