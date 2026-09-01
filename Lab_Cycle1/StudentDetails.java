import java.util.Scanner;

class StudentDetails {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your RollNo : ");
        int rollno =sc.nextInt();

        sc.nextLine();

        System.out.print("Course : ");
        String course =sc.nextLine();

        System.out.println("Percentage : ");
        double percentage = sc.nextDouble();

        System.out.println("Student Details : ");
        System.out.println("-----------------");
        System.out.println("Name : " + name);
        System.out.println("RollNo : " + rollno);
        System.out.println("Course : " + course);
        System.out.println("Percentage : " + percentage+ "%" );


    }
}