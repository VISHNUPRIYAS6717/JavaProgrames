public class UniversityEvaluationDemo {

    public static void main(String[] args) {

        // Array of abstract class references
        StudentEvaluation[] students = new StudentEvaluation[6];

        students[0] = new UGCourseEvaluation(
                101, "Arun", "B.Sc Computer Science",
                new int[]{85, 78, 92, 88, 90});

        students[1] = new UGCourseEvaluation(
                102, "Priya", "BCA",
                new int[]{75, 82, 68, 79, 85});

        students[2] = new PGCourseEvaluation(
                201, "Rahul", "M.Sc Computer Science",
                new int[]{80, 85, 88, 82, 90});

        students[3] = new PGCourseEvaluation(
                202, "Divya", "MCA",
                new int[]{70, 75, 78, 80, 76});

        students[4] = new CertificateCourseEvaluation(
                301, "Karthik", "Java Certificate",
                new int[]{90, 85, 88});

        // New course type
        students[5] = new DiplomaCourseEvaluation(
                401, "Meena", "Diploma in Software Development",
                new int[]{82, 76, 88, 80});

        System.out.println("==============================================");
        System.out.println("       UNIVERSITY EVALUATION SYSTEM");
        System.out.println("==============================================");

        for (StudentEvaluation student : students) {

            System.out.println("\n----------------------------------------------");

            student.displayDetails();

            System.out.println("Total Marks  : " + student.calculateTotal());

            student.displayGrade();
        }

        System.out.println("\n==============================================");
        System.out.println("Evaluation Completed Successfully!");
        System.out.println("==============================================");
    }
}