
public class Student {


    private int studentId;
    private String studentName;
    private String department;


    private int mark1;
    private int mark2;
    private int mark3;

    private boolean marksEntered = false;


    public Student(int id, String name, String dept) {

        studentId = id;
        studentName = name;
        department = dept;

    }


    public int getStudentId() {
        return studentId;
    }


    public void setMarks(int m1, int m2, int m3) {

        if (m1 < 0 || m1 > 100 ||
                m2 < 0 || m2 > 100 ||
                m3 < 0 || m3 > 100) {

            System.out.println("Marks must be between 0 and 100!");
            return;
        }

        mark1 = m1;
        mark2 = m2;
        mark3 = m3;

        marksEntered = true;

        System.out.println("Marks saved successfully!");

    }


    public int calculateTotal() {

        return mark1 + mark2 + mark3;

    }


    public double calculateAverage() {

        return calculateTotal() / 3.0;

    }


    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        }
        else if (average >= 80) {
            return "A";
        }
        else if (average >= 70) {
            return "B";
        }
        else if (average >= 60) {
            return "C";
        }
        else if (average >= 50) {
            return "D";
        }
        else {
            return "Fail";
        }

    }


    public String calculateResult() {

        if (mark1 >= 35 &&
                mark2 >= 35 &&
                mark3 >= 35) {

            return "PASS";

        }
        else {

            return "FAIL";

        }

    }


    public boolean hasMarks() {

        return marksEntered;

    }


    public void displayStudent() {

        System.out.println("\n===== STUDENT REPORT =====");

        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + studentName);
        System.out.println("Department  : " + department);

        if (marksEntered) {

            System.out.println("Subject 1   : " + mark1);
            System.out.println("Subject 2   : " + mark2);
            System.out.println("Subject 3   : " + mark3);

            System.out.println("Total Marks : " + calculateTotal());
            System.out.println("Average     : " + calculateAverage());
            System.out.println("Grade       : " + calculateGrade());
            System.out.println("Result      : " + calculateResult());

        }
        else {

            System.out.println("Marks       : Not Entered");

        }

    }

}
