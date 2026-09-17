public class PGCourseEvaluation extends StudentEvaluation {

    public PGCourseEvaluation(int studentId, String studentName,
                              String courseName, int[] marks) {
        super(studentId, studentName, courseName, marks);
    }

    @Override
    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        // PG evaluation includes 10 bonus marks
        return total + 10;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotal();
        double percentage = total / (double) (marks.length * 100) * 100;

        if (percentage >= 85)
            System.out.println("Grade        : A+");
        else if (percentage >= 75)
            System.out.println("Grade        : A");
        else if (percentage >= 65)
            System.out.println("Grade        : B");
        else if (percentage >= 55)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : F");
    }
}