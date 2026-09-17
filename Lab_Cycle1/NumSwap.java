import java.util.Scanner;

class NumSwap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("A=");
        int a=sc.nextInt();

        System.out.print("B=");
        int b=sc.nextInt();


        System.out.println("Before Swap");
        System.out.println("A = "+a);
        System.out.println("B = "+b);


        int temp=a;
        a=b;
        b=temp;


        System.out.println("After Swap");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}

