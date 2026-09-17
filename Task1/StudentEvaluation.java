// Abstract class representing common student evaluation details
public abstract class StudentEvaluation {

    protected int studentId;
    protected String studentName;
    protected String courseName;
    protected int[] marks;

    // Constructor
    public StudentEvaluation(int studentId, String studentName,
                             String courseName, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.marks = marks;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + courseName);
    }

    // Abstract methods
    public abstract int calculateTotal();

    public abstract void displayGrade();
}