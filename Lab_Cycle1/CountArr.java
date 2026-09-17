import java.util.Scanner;

class CountArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size:");
        int n=sc.nextInt();

        int a[]=new int[n];

        int positive=0, negative=0, zero=0;

        System.out.println("Enter numbers:");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

            if(a[i]>0)
                positive++;
            else if(a[i]<0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers = "+positive);
        System.out.println("Negative numbers = "+negative);
        System.out.println("Zeros = "+zero);
    }
}
