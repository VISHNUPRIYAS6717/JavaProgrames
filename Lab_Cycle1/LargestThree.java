import java.util.Scanner;

class LargestThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);


        System.out.print("A=");
        int a=sc.nextInt();

        System.out.print("B=");
        int b=sc.nextInt();

        System.out.print("C=");
        int c=sc.nextInt();


        int largest;


        if(a>b && a>c)
            largest=a;

        else if(b>c)
            largest=b;

        else
            largest=c;


        System.out.println("Largest = "+largest);
    }
}

