import java.util.Scanner;

class PrimeCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=sc.nextInt();

        int count=0;


        if(n<=1)
        {
            System.out.println(n+" is Not Prime");
            return;
        }


        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }


        if(count==0)
            System.out.println(n+" is Prime");
        else
            System.out.println(n+" is Not Prime");
    }
}
