public class DiplomaCourseEvaluation extends StudentEvaluation {

    public DiplomaCourseEvaluation(int studentId, String studentName,
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

        if (percentage >= 75)
            System.out.println("Grade        : Distinction");
        else if (percentage >= 60)
            System.out.println("Grade        : First Class");
        else if (percentage >= 50)
            System.out.println("Grade        : Pass");
        else
            System.out.println("Grade        : Fail");
    }
}