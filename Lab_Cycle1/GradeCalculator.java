import java.util.Scanner;

class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks: ");
        int mark=sc.nextInt();


        if(mark>=90 && mark<=100)
            System.out.println("Grade = A");

        else if(mark>=80)
            System.out.println("Grade = B");

        else if(mark>=70)
            System.out.println("Grade = C");

        else
            System.out.println("Grade = D");
    }
}
