import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,count=0,sum=0;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
         for (i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=sum/n;
        for (i=0;i<n;i++)
        {
            if (avg>=x[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}