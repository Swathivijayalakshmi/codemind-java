import java.util.Scanner;
class smaple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,sum=0,A,B;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
         A=sc.nextInt();
         B=sc.nextInt();
        for (i=0;i<n;i++)
        {
            if (x[i]<A || x[i]>B)
            sum=sum+x[i];
        }
        System.out.println(sum);
        
    }
}