public class UGCourseEvaluation extends StudentEvaluation {

    public UGCourseEvaluation(int studentId, String studentName,
                              String courseName, int[] marks) {
        super(studentId, studentName, courseName, marks);
    }

    @Override
    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotal();
        double percentage = total / (double) marks.length;

        if (percentage >= 90)
            System.out.println("Grade        : A+");
        else if (percentage >= 80)
            System.out.println("Grade        : A");
        else if (percentage >= 70)
            System.out.println("Grade        : B");
        else if (percentage >= 60)
            System.out.println("Grade        : C");
        else if (percentage >= 50)
            System.out.println("Grade        : D");
        else
            System.out.println("Grade        : F");
    }
}